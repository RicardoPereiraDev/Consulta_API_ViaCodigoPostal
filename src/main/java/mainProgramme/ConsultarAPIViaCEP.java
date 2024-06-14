import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sun.jdi.PathSearchingVirtualMachine;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ConsultarAPIViaCEP {

    public static void main(String[] args) throws IOException {


        Scanner sc = new Scanner(System.in);

        ConsultaCodigoPostal consultaCodigoPostal = new ConsultaCodigoPostal();

        while(true) {
            System.out.println("Digite um codigo postal para ver se busca na API ou 'sair' para terminar o programa ");
            String codPostal = sc.nextLine();

            if (codPostal.equalsIgnoreCase("sair")) {
                    break;
                   }


            try {
                Enderecoo novoEnderecoo = consultaCodigoPostal.buscarEndereco(codPostal);
                System.out.println(novoEnderecoo);
            }
            catch (RuntimeException e){
                System.out.println(e.getMessage());
                System.out.println("Finalizando a aplicação");
            }
            //String buscar = "";
            //CodigoPostal codigoPostal = new CodigoPostal(2850,"bairro gouveia", "Alhos Vedros");

            /*
            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE) //isto porque na classe de TitleOmdb tem o title com letra minuscula devido ao padrao do java de camelCase e quando faço run ele vem com null porque no formato Json que vem da API está com letra maiuscula
                    .setPrettyPrinting()
                    .create();


             */
            // while(true) {


            //  if (buscar.equalsIgnoreCase("sair")) {
            //    break;
            //   }


            //String endereco = "https://viacep.com.br/ws/" + buscar + "/json/";

            //try {
            //  HttpClient client = HttpClient.newHttpClient();
            //HttpRequest request = HttpRequest.newBuilder()
            //      .uri(URI.create(endereco))
            //    .build();

            //  HttpResponse<String> response = client
            //        .send(request, HttpResponse.BodyHandlers.ofString());

            // String json = response.body();
            // System.out.println(json);


            //Agora vou querer transformar ou converter este Json em CodigoPostal.class
            //  codigoPostal = gson.fromJson(json, CodigoPostal.class);
            //System.out.println(codigoPostal);

            // FileWriter escrita = new FileWriter("codigos postais.txt");
            // escrita.write(codigoPostal.toString());
            // escrita.close();

            //  System.out.println(codigoPostal);

            // } catch (NumberFormatException e) {
            //   System.out.println("Aconteceu um erro: " + e.getMessage());
            ;
            // } catch (IllegalArgumentException e) {

        }
            //System.out.println("Algum erro de argumento na busca, verifique o endereço");
            // } catch (InterruptedException e) {
            //   throw new RuntimeException(e);
            // } catch (IOException e) {
            //   throw new RuntimeException(e);
      //  }
        //}
      //  System.out.println(codigoPostal);

        //Agora precisava de transformar num Json para salvar

        //Agora vou precisar de pegar esse codigos postais e transformar em gson

      //  escrita.write(gson.toJson(codigoPostal));
       // escrita.close();
        System.out.println("Programa finalizou correctamente");
    }
}
