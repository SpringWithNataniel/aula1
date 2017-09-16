/*
*
* Aula com Nataniel Paiva
*
* Esse projeto poderá ser distribuído da forma que você achar melhor
* O importante é que você aprenda de verdade!
*
 */
package io.spring.aula.natan.controller;

import io.spring.aula.natan.entity.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Nataniel Paiva <nataniel.paiva@gmail.com>
 */
@RestController
public class IndexController {

    @RequestMapping(value = "/{nome}", method = RequestMethod.GET)
    public Usuario getUsuario(@PathVariable String nome) {

        Usuario usuario = new Usuario();

        usuario.setNome(nome);
        usuario.setIdade(26);
        usuario.setEmail("nataniel.paiva@gmail.com");

        return usuario;
    }

}
