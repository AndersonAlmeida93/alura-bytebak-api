package io.swagger.api;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import io.swagger.annotations.ApiParam;
import io.swagger.model.Cliente;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-20T20:36:55.717Z[GMT]")
@Controller
public class ClienteApiController implements ClienteApi {

	@Autowired
	private ClienteService clienteService;
	
	@Autowired
	private RespostasUtil respostaUtil;

    public ResponseEntity<Cliente> cadastrarCliente(@ApiParam(value = ""  )  @Valid @RequestBody Cliente cliente_) {
    	
    	try {
    		
    		return clienteService.salva(cliente_);
    		
		} catch (Exception e) {

			return respostaUtil.getErroInternoCliente(clienteService.FALHA_AO_TENTAR_CADASTRAR_UM_CLIENTE); 
		}
    }

}
