package modelo;

import excepciones.ClienteIncompletoException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class Cliente {

    private String firstName;
    private String lastName;
    private String numOfDoc;
    private LocalDate dateOfBirthday;
    private String phone;
    private String address;
    private Integer idCliente;
    private List<Vehiculo> vehiculos;

    public Cliente(Integer idCliente, String firstName, String lastName, String numOfDoc,
                   LocalDate dateOfBirthday, String address, String phone) {
        this.idCliente = idCliente;
        this.firstName = firstName;
        this.lastName =  lastName;
        this.numOfDoc = numOfDoc;
        this.dateOfBirthday = dateOfBirthday;
        this.address = address;
        this.phone = phone;
        this.vehiculos = new ArrayList<Vehiculo>();
    }

    public static Cliente factoryCliente(Integer idCliente, String firstName, String lastName,
                                         String numOfDoc, LocalDate dateOfBirthday, String address, String phone) throws ClienteIncompletoException{
        if (numOfDoc == null || numOfDoc.length() == 0)
            throw new ClienteIncompletoException("Cliente Incompleto Exception: Nro de Doc incompleto");

        if (age(dateOfBirthday) < 18){
            throw new ClienteIncompletoException("Cliente Menor Exception: El cliente es menor de edad");
        }
        return new Cliente(idCliente,firstName,lastName,numOfDoc,dateOfBirthday,address, phone);
    }
    private static Integer age (LocalDate dateOfBithday){
        Integer age = LocalDate.now().getYear()  -  dateOfBithday.getYear();
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cliente)) return false;
        Cliente cliente = (Cliente) o;
        return numOfDoc.equals(cliente.numOfDoc);
    }

    public void asignarVehiculo(Vehiculo elVehiculo) {
        this.vehiculos.add(elVehiculo);
    }

    public List<Vehiculo> devolverVehiculos() {
        return vehiculos;
    }

    @Override
    public String toString() {
        return this.lastName + ", " + this.firstName+ " - " + this.numOfDoc;
    }

    public String getNumOfDoc() {
        return numOfDoc;
    }

    public void setNumOfDoc(String numOfDoc) {
        this.numOfDoc = numOfDoc;
    }
}
