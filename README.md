![template.png](..%2FImagens%2Ftemplate.png)
# Desafio

Vamos implementar uma aplicação para consultar um endereço a partir de um Codigo de Postal e salvar as informações em um arquivo json.

## 🔨 Objetivos do projeto:

- Criar uma classe que representa um endereço (codigoPostal, uf, cidade, bairro, logradouro e complemento);
- Criar uma classe que consulta a API ViaCEP para buscar um endereço a partir de um cep ou codigo postal (exemplo: https://viacep.com.br/ws/04101300/json);
- Criar uma classe que cria um arquivo json contendo os dados de um objeto Endereco;
- Criar uma classe com método main que deve solicitar ao utilizador que informe um CEP e na sequencia utilizar as classes para consultar a api ViaCEP e salvar os dados do endereço em um arquivo json.

## Observações:

- Utilizei a biblioteca GSon para converter o JSON devolvido pela API ViaCEP em um objeto Endereco;
- Utilizei a biblioteca GSon para salvar um objeto Endereco em um arquivo .json;
- O arquivo deve ter como nome o cep/codigo de postal informado (exemplo: 04101300.json);