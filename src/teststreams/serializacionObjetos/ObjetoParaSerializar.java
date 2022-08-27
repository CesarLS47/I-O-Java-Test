package teststreams.serializacionObjetos;

import java.io.*;

public class ObjetoParaSerializar implements Serializable {

  private int cuenta;
  private String primerNombre;
  private String apellido;
  private double saldo;

  public ObjetoParaSerializar() {
    this(0, "Cesar", "Latorre", 40000);
  }

  public ObjetoParaSerializar(int cuenta, String primerNombre, String apellido, double saldo) {
    this.setCuenta(cuenta);
    this.setPrimerNombre(primerNombre);
    this.setApellido(apellido);
    this.setSaldo(saldo);
  }

  public int getCuenta() {
    return cuenta;
  }

  public void setCuenta(int cuenta) {
    this.cuenta = cuenta;
  }

  public String getPrimerNombre() {
    return primerNombre;
  }

  public void setPrimerNombre(String primerNombre) {
    this.primerNombre = primerNombre;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  @Override
  public String toString() {
    return "Hola a todos, mi nombre es " + this.getPrimerNombre() +
        " y mi apellido: " + this.getApellido() +
        ". Mi numero de cuenta es " + this.getCuenta() + " y su saldo es " + this.getSaldo();
  }

  public boolean equals(ObjetoParaSerializar inputObj) {
    return this.getCuenta() == inputObj.getCuenta() &&
        this.getApellido().equals(inputObj.getApellido()) &&
        this.getPrimerNombre().equals(inputObj.getPrimerNombre()) &&
        this.getSaldo() == inputObj.saldo;
  }
}
