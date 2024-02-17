

package com.mycompany.youtubee;


public class Youtubee {

    public static void main(String[] args) {
        Usuario usuario= new Usuario("Juan Iran GP");
       Video video= new Video ("Aprendiendo Java pt.2",1705,"https;//yotube");
       usuario.subirVideo(video);
       usuario.mostrarInfoUsuario();
    }
}
