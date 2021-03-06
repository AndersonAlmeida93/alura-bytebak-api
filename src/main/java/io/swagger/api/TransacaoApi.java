/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.18).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Transacao;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-20T20:36:55.717Z[GMT]")
@Api(value = "transacao", description = "the transacao API")
public interface TransacaoApi {

    @ApiOperation(value = "Altera o valor da Transação", nickname = "alteraValorTransacao", notes = "Altera o valor transação na conta do cliente.", authorizations = {
        @Authorization(value = "BasicAuth")    }, tags={ "Transacao", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Alteração do valor efetuada com sucesso"),
        @ApiResponse(code = 400, message = "Requisição inválida"),
        @ApiResponse(code = 401, message = "Requisição não autorizada"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    @RequestMapping(value = "/transacao/{codigo}",
        method = RequestMethod.PUT)
    ResponseEntity<Void> alteraValorTransacao(@ApiParam(value = "",required=true) @PathVariable("codigo") Long codigo
,@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "valor", required = true) Double valor
,@ApiParam(value = "" ,required=true) @RequestHeader(value="Authorization", required=true) String authorization
);


    @ApiOperation(value = "Cadastra Transação na Conta", nickname = "cadastraTransao", notes = "Cdastrar uma transação de débito ou déposito na conta.", response = Transacao.class, authorizations = {
        @Authorization(value = "BasicAuth")    }, tags={ "Transacao", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Cadastro de transação efetuado com sucesso.", response = Transacao.class),
        @ApiResponse(code = 400, message = "Requisição inválida"),
        @ApiResponse(code = 401, message = "Requisição não autorizada"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    @RequestMapping(value = "/transacao",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Transacao> cadastraTransao(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Transacao body
,@ApiParam(value = "" ,required=true) @RequestHeader(value="Authorization", required=true) String authorization
,@NotNull @ApiParam(value = "", required = true, allowableValues = "debito, deposito") @Valid @RequestParam(value = "tipo", required = true) String tipo
);


    @ApiOperation(value = "Exclui a Transação", nickname = "excluiTransacao", notes = "Exclusão da transação existente na conta do cliente.", authorizations = {
        @Authorization(value = "BasicAuth")    }, tags={ "Transacao", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Transação excluida com sucesso"),
        @ApiResponse(code = 400, message = "Requisição inválida"),
        @ApiResponse(code = 401, message = "Requisição não autorizada"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    @RequestMapping(value = "/transacao/{codigo}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> excluiTransacao(@ApiParam(value = "",required=true) @PathVariable("codigo") Long codigo
,@ApiParam(value = "" ,required=true) @RequestHeader(value="Authorization", required=true) String authorization
);

}
