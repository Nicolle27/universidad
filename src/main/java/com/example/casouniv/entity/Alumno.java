package com.example.casouniv.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@AllArgsConstructor 
@NoArgsConstructor
public class Alumno implements Serializable{
	private static final long serialVersionUID = 1L;
	private int id_alumno;
	private int id_asignatura;
	private int id_curso_escolar;
	public int getId_alumno() {
		return id_alumno;
	}
	public void setId_alumno(int id_alumno) {
		this.id_alumno = id_alumno;
	}
	public int getId_asignatura() {
		return id_asignatura;
	}
	public void setId_asignatura(int id_asignatura) {
		this.id_asignatura = id_asignatura;
	}
	public int getId_curso_escolar() {
		return id_curso_escolar;
	}
	public void setId_curso_escolar(int id_curso_escolar) {
		this.id_curso_escolar = id_curso_escolar;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}	
	
}
