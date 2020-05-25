package com.example.restwithspringbootudemy;
import com.example.exception.UnsupportedMathOperationException;
import org.springframework.web.bind.annotation.*;

import static com.example.converters.numberConverter.convertToDouble;
import static com.example.converters.numberConverter.isNumeric;

@RestController
public class MathController {

    @RequestMapping(value="/sum/{numberOne}/{numberTwo}", method= RequestMethod.GET)
    public Double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {

        if(!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        Double sum = convertToDouble(numberOne) + convertToDouble(numberTwo) ;

        return sum;
    }

    @RequestMapping(value="/subtract/{numberOne}/{numberTwo}", method= RequestMethod.GET)
    public Double subtract(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {

        if(!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        Double diff = convertToDouble(numberOne) - convertToDouble(numberTwo) ;

        return diff;
    }

    @RequestMapping(value="/multiply/{numberOne}/{numberTwo}", method= RequestMethod.GET)
    public Double multiply(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {

        if(!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        Double multiplication = convertToDouble(numberOne) * convertToDouble(numberTwo) ;

        return multiplication;
    }

    @RequestMapping(value="/divide/{numberOne}/{numberTwo}", method= RequestMethod.GET)
    public Double divide(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {

        if(!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        Double division = convertToDouble(numberOne) / convertToDouble(numberTwo) ;

        return division;
    }

    @RequestMapping(value="/average/{numberOne}/{numberTwo}", method= RequestMethod.GET)
    public Double average(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {

        if(!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        Double average = (convertToDouble(numberOne) + convertToDouble(numberTwo)) / 2 ;

        return average;
    }

    @RequestMapping(value="/squareroot/{numberOne}", method= RequestMethod.GET)
    public Double squareroot(@PathVariable("numberOne") String numberOne) throws Exception {

        if(!isNumeric(numberOne)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        Double sqrt = Math.sqrt(convertToDouble(numberOne));

        return sqrt;
    }







}
