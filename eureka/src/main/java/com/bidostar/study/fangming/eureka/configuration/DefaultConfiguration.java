package com.bidostar.study.fangming.eureka.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.lang.Nullable;

import java.io.IOException;
import java.util.List;

@Configuration
public class DefaultConfiguration {


//    @Bean
//    public HttpMessageConverter<String> httpMessageConverter(){
//        HttpMessageConverter<String> httpMessageConverter = new HttpMessageConverter<String>() {
//            @Override
//            public boolean canRead(Class<?> clazz, @Nullable MediaType mediaType) {
//                System.out.println("canRead");
//                return false;
//            }
//
//            @Override
//            public boolean canWrite(Class<?> clazz, @Nullable MediaType mediaType) {
//                System.out.println("canWrite");
//                return false;
//            }
//
//            @Override
//            public List<MediaType> getSupportedMediaTypes() {
//                System.out.println("getSupportedMediaTypes");
//                return null;
//            }
//
//            @Override
//            public String read(Class<? extends String> clazz, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {
//                System.out.println("read");
//                return null;
//            }
//
//            @Override
//            public void write(String s, @Nullable MediaType contentType, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {
//                System.out.println("write");
//            }
//        };
//        return httpMessageConverter;
//
//    }

}
