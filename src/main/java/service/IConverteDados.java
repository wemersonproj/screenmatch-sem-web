package service;

import com.fasterxml.jackson.databind.ObjectMapper;

public interface IConverteDados {

    <T> T obeterDados(String json, Class<T> classe);
}
