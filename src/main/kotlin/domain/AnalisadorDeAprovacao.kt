package domain

import domain.criterios.Basico
import domain.criterios.CriterioDeAprovacao
import domain.criterios.Intermediario
import domain.criterios.Rigoroso
import domain.Boletim
import domain.BoletimFechado

class AnalisadorDeAprovacao {

    // ---------------------------------
    //
    //      Seu código deve vir aqui
    //
    //      Defina atributos e métodos conforme especificado
    //      no arquivo de teste encontrado em
    //      'src/test/kotlin/domain/AnalisadorDeAprovacaoTest'
    //
    // ---------------------------------

    private lateinit var criterioAprov : CriterioDeAprovacao

    fun defineCriterio(criterio:CriterioDeAprovacao){
        criterioAprov = criterio
    }

    fun fechaBoletim(boletim: Boletim) : BoletimFechado{
        val boletimFechado : BoletimFechado =  BoletimFechado(mediaEPs = boletim.mediaEPs, mediaMiniEPs = boletim.mediaMiniEPs, mediaFinal = criterioAprov.mediaFinal(boletim), foiAprovado = criterioAprov.estaAprovado(boletim))
        return boletimFechado
    }

}