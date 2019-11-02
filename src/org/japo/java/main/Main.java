/* 
 * Copyright 2019 Mario Merlos Abella <mario.merlos.alum@iescamp.es>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Mario Merlos Abella <mario.merlos.alum@iescamp.es>
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {

        //variables & Constantes
        boolean error;
        double nota;

        //Inicio bucle
        do {
            try {
                System.out.print("Insertar nota ...: ");
                nota = SCN.nextDouble();

                if (nota >= 5 && nota <= 10) {
                    System.out.printf(Locale.ENGLISH, "El alumno ha APROBADO con ...:  %.2f%n", nota);
                    error = false;

                } else {
                    error = true;
                    System.out.println("valor incorrecto");
                }

            } catch (Exception e) {
                error = true;
                System.out.println("valor incorrecto");
                SCN.nextLine();
            } finally {
                SCN.nextLine();
            }
        } while ((error == true));
        System.out.println("END");

    }

}
