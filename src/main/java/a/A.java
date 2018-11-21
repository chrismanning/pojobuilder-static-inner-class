package a;

import java.util.List;

import a.b.B;
import a.b.C;
import net.karneim.pojobuilder.GeneratePojoBuilder;

/**
 * TODO A
 *
 * @author christianm
 */
@GeneratePojoBuilder
public class A {

    List<B.Inner> bs;
    List<C.Inner> cs;

}
