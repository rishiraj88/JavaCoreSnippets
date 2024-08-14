package org.example;

import org.example.Product;
import org.example.records.RecordPatternsWithInstanceof;

import java.util.Locale;

import static java.util.FormatProcessor.FMT;

public class Main {

    public static void main(String[] args) {

        var product = new Product(1L, "Laptop", 1000.0);

        // Concatenation using + operator
        var string1 = "Product with id " + product.productId() + " is " +
                product.name() + " and has price $" + product.price();

        System.out.println(string1);

        // Concatenation using StringBuilder
        var string2 = new StringBuilder()
                .append("Product with id ")
                .append(product.productId())
                .append(" is ")
                .append(product.name())
                .append(" and has price $")
                .append(product.price())
                .toString();

        System.out.println(string2);

        // Concatenation using String.format
        var string3 = String.format(Locale.US,
                "Product with id %s is %s" +
                        " and has price $%.2f",
                product.productId(), product.name(), product.price());

        System.out.println(string3);

        var string4 = FMT."Product is \{product.productId()}: \{product.name()}, priced at $%.2f\{product.price()}";
        System.out.println(string4);

        CollectionSequences.testCollectionSequences();
        RecordPatternsWithInstanceof.test();
    }

}
