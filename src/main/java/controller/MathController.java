package controller;
import com.example.exception.UnsupportedMathOperationException;
import com.example.math.SimpleMath;
import org.springframework.web.bind.annotation.*;

import static com.example.converters.numberConverter.convertToDouble;
import static com.example.converters.numberConverter.isNumeric;

@RestController
public class MathController {

    SimpleMath math = new SimpleMath();

    @RequestMapping(value="/sum/{numberOne}/{numberTwo}", method= RequestMethod.GET)
    public Double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {

        if(!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }

        return math.sum(numberOne, numberTwo);
    }

    @RequestMapping(value="/subtract/{numberOne}/{numberTwo}", method= RequestMethod.GET)
    public Double subtract(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {

        if(!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return math.subtract(numberOne, numberTwo);
    }

    @RequestMapping(value="/multiply/{numberOne}/{numberTwo}", method= RequestMethod.GET)
    public Double multiply(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {

        if(!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }

        return math.multiply(numberOne, numberTwo);
    }

    @RequestMapping(value="/divide/{numberOne}/{numberTwo}", method= RequestMethod.GET)
    public Double divide(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {

        if(!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return divide(numberOne, numberTwo);
    }

    @RequestMapping(value="/average/{numberOne}/{numberTwo}", method= RequestMethod.GET)
    public Double average(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {

        if(!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }

        return math.average(numberOne, numberTwo);
    }

    @RequestMapping(value="/squareroot/{numberOne}", method= RequestMethod.GET)
    public Double squareroot(@PathVariable("numberOne") String number) throws Exception {

        if(!isNumeric(number)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return math.squareRoot(number);
    }







}
