package br.com.alura.service;

import br.com.alura.client.HttpClientConfiguration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.http.HttpResponse;

import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.anyString;

public class AbrigoServiceTest {

    private HttpClientConfiguration client = mock(HttpClientConfiguration.class);
    private AbrigoService abrigoService = new AbrigoService();
    private HttpResponse<String> response = mock(HttpResponse.class);

    @Test
    public void deveVerificarSeDispararRequisicaoGetSeraChamado() throws IOException, InterruptedException {
        String expectedAbrigosCadastrados = "Abrigos cadastrados:";
        String expectedIdENome = "0 - Teste";

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        System.setOut(printStream);

        String fakeJson = "[{\"id\":0,\"nome\":\"Teste\",\"telefone\":\"61981880392\",\"email\":\"abrigo_alura@gmail.com\"}]";

        when(response.body()).thenReturn(fakeJson);
        when(client.dispararRequisicaoGet(anyString())).thenReturn(response);

        abrigoService.listarAbrigos();

        String[] lines = baos.toString().split(System.lineSeparator());
        String actualAbrigosCadastrados = lines[0];
        String actualIdENome = lines[1];

        Assertions.assertEquals(expectedAbrigosCadastrados, actualAbrigosCadastrados);
        Assertions.assertEquals(expectedIdENome, actualIdENome);
    }
}