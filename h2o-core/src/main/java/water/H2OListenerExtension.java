package water;

import java.util.ArrayList;

public interface H2OListenerExtension {

  /** Name of listener extension */
  String getName();

  /** Initialize the exception */
  void init();

  void report(String ctrl, Object... data);

  ArrayList<Object[]> getData(String ctrl);
}
