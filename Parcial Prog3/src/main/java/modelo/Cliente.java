package modelo;

import excepciones.ClienteIncompletoException;
import excepciones.ClienteMenorEdadException;

import java.time.LocalDate;

public class Cliente {

    private String firstName;
    private String lastName;
    private String numOfDoc;
    private LocalDate dateOfBirthday;
    private String phone;
    private String address;
    private Integer idCliente;

    public Cliente(Integer idCliente, String firstName, String lastName, String numOfDoc,
                   LocalDate dateOfBirthday, String address, String phone) {
        this.idCliente = idCliente;
        this.firstName = firstName;
        this.lastName =  lastName;
        this.numOfDoc = numOfDoc;
        this.dateOfBirthday = dateOfBirthday;
        this.address = address;
        this.phone = phone;
    }

    public static Cliente factoryCliente(Integer idCliente, String firstName, String lastName,
                                         String numOfDoc, LocalDate dateOfBirthday, String address, String phone) throws ClienteIncompletoException, ClienteMenorEdadException {
        if (numOfDoc == null || numOfDoc.length() == 0)
            throw new ClienteIncompletoException();

        if (age(dateOfBirthday) < 18){
            throw new ClienteMenorEdadException();
        }
        return new Cliente(idCliente,firstName,lastName,numOfDoc,dateOfBirthday,address, phone);
    }
    private static Integer age (LocalDate dateOfBithday){
        Integer age = LocalDate.now().getYear()  -  dateOfBithday.getYear();
        return age;
    }

}
