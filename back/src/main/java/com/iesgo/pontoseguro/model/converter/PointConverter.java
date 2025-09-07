package com.iesgo.pontoseguro.model.converter;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter
public class PointConverter implements AttributeConverter<Point, String> {

    @Override
    public String convertToDatabaseColumn(Point point) {
        if (point == null) return null;
        return "(" + point.getX() + "," + point.getY() + ")";
    }

    @Override
    public Point convertToEntityAttribute(String dbData) {
        if (dbData == null || dbData.isEmpty()) return null;

        // Remove parênteses e divide as coordenadas
        String formatada = dbData.replace("(", "").replace(")", "");
        String[] parte = formatada.split(",");

        if (parte.length == 2) {
            try {
                Double x = Double.parseDouble(parte[0]);
                Double y = Double.parseDouble(parte[1]);
                return new Point(x, y);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Formato de ponto inválido: " + dbData);
            }
        }
        throw new IllegalArgumentException("Formato de ponto inválido: " + dbData);
    }
}
