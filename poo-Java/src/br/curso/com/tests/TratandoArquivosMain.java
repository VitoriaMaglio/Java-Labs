package br.curso.com.tests;

import br.curso.com.entities.TratandoArquivosFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//Ler um caminho de um arquivo .csv contendo daos de itens vendidos, sendo que cada item possui um preço unitário e quantidade.
//gerar um novo arquivo chamado summary.csv localizado em um sub pasta chamada out a partir da original com o nome e valor total do item

public class TratandoArquivosMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<TratandoArquivosFile> list = new ArrayList<>();

        System.out.println("Enter file path ");
        String sourceFileStr = sc.nextLine();

        File sourceFile = new File(sourceFileStr);
        String sourceFolderStr = sourceFile.getParent();
        System.out.println(sourceFolderStr);

        boolean succes = new File(sourceFolderStr + "\\out").mkdir();
        System.out.println("Folder create" + succes);

        String targetFileStr = sourceFolderStr + "\\out\\summary.csv";

        try(BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))){
            String itemCsv = br.readLine();
            while (itemCsv != null){
                String[] fields = itemCsv.split(",");
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);
                list.add(new TratandoArquivosFile(name,price,quantity));
                itemCsv = br.readLine();
            }

            try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))){
                for (TratandoArquivosFile file : list){
                    bw.write(file.getName() + "," + file.total());
                    bw.newLine();
                }
            }catch (IOException e){
                System.out.println("error");
            }
        }catch (IOException e){
            System.out.println("Error");
        }

    }
}
