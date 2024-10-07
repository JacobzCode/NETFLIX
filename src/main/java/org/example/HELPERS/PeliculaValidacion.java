package org.example.HELPERS;

import org.example.MODELOS.Pelicula;

import java.time.LocalDate;

public class PeliculaValidacion {

    //VOY A TRAER OTRA CLASE A ESTA:
    //INYECCION DE DEPENDENCIAS ---> DONDE UNA CLASE SE TRAE DENTRO DE OTRA

    private Pelicula pelicula=new Pelicula();

    //implementar metodos para validar informacion
    public boolean validarId (Integer id){
        //ID NO PUEDE SER NUMERO NEGATIVO
        //ID NO PUEDE SER MAYOR A 5000000

        if(id<0){
            return false;
        } else if (id<5000000){
            return false;

        }else if{
        return true;
    }
    }
    public boolean validarNombre(String nombre){
        //SE PROHIBEN LOS NUMEROS
        //SE PROHIBEN LOS CARACTERES ESPECIALES
        return true;
    }
    public boolean validarFecha(LocalDate fecha){
        //PELICULAS ANTERIORES A 1920

        int anio=fecha.getYear();
        if(anio<1920){
            return false;
        }else{
            return true;
        }
    }
    public boolean validarDuracion(Integer duracion){
        //PELICULAS PROHIBIDAS SI DURAN MAS DE 200 MINUTOS

        if(duracion>200){
            return false;
        }else {
            return true;
        }
    }
    public boolean validarSinopsis(String sinopsis){
        //NO DEBE TENER MENOS DE 100 CARACTERES
        //NO DEBE TENER MAS DE 500 CARACTERES

        if (sinopsis.length()<100 || sinopsis.length()>500){
            return false;
        }else {
        return true;
    }

}
