package edu.servicios;
import java.util.Scanner;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.Dtos.usuarioDTO;

@RestController
public class UsuarioController {
	Scanner sc = new Scanner(System.in);
    @GetMapping("/api/clubes/") // Cambia la ruta según tus necesidades
    public usuarioDTO nuevoClub() {
        usuarioDTO club = new usuarioDTO();
        club.setId(1);
        System.out.println("Nombre del club");
        club.setNombre(sc.next());
        System.out.println("Correo electronico del club");
        club.setCorreo_electronico(sc.next());
        System.out.println("Pais del club");
        club.setPais(sc.next());
        System.out.println("Localidad del club");
        club.setLocalidad(sc.next());
        System.out.println("Sede del club");
        club.setSede_principal(sc.next());
        System.out.println("Contraseña del club");
        club.setContraseña(sc.next()); // No se recomienda enviar la contraseña en JSON

        return club; // Jackson convierte automáticamente el objeto a JSON
    }
}
 /*
  * package edu.Dtos;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class usuarioDTO {
    private int id;

    @NotBlank(message = "El nombre es obligatorio")
    private String nombre;

    @Email(message = "El correo electrónico debe ser válido")
    private String correo_electronico;

    private String pais;
    private String localidad;
    private String sede_principal;

    @NotBlank(message = "La contraseña es obligatoria")
    private String contraseña;

    // Getters y Setters
}
*/