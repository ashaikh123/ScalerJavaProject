package org.scaler;

import org.scaler.Exception.RetrofitClientException;
import org.scaler.RestAPI.RestClient;
import org.scaler.httpClient.Client;

import java.io.IOException;

public class Main {


    public static void main(String[] args) throws IOException, RetrofitClientException {

        if( args.length == 0 || args.length >1 ){
            throw new IllegalArgumentException("Wrong number of args passed");
        }

        Client c = new Client();
        String value = args[0];
        switch (value) {
            case "print":
                System.out.println("Hello world!");
                break;
            case "http":
                try{
                    RestClient restClient = new RestClient();
                    var apiResponse =  restClient
                            .getJsonPlaceHolderAPI()
                            .getPhotos().execute();
                    apiResponse.body().forEach(photo -> {
                        var id=photo.getId();
                        if(id%50 ==1 ) {
                            System.out.println(photo.getAlbumId() + ":\n");
                        }
                        if(id%50 ==1 || id%50 ==2) {
                            System.out.println("\tPhoto "+id + "\n");
                        }
                    });
                } catch(Exception e){
                    // log any thing, you can here
                    throw new RetrofitClientException("Exception");
                }


        }

    }
}
