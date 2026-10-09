package cl.agustin.inventario.categoria;

import org.hibernate.annotations.ValueGenerationType;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity 
public class Categoria {
    @Id 
    private Long id;
    private String nombre;
    private String descripcion;

}
