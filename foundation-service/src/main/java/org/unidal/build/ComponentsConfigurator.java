package org.unidal.build;

import java.util.ArrayList;
import java.util.List;

import org.unidal.formatter.DateFormatter;
import org.unidal.helper.Threads.LoggerThreadListener;
import org.unidal.initialization.DefaultModuleContext;
import org.unidal.initialization.DefaultModuleInitializer;
import org.unidal.initialization.DefaultModuleManager;
import org.unidal.lookup.configuration.AbstractResourceConfigurator;
import org.unidal.lookup.configuration.Component;

class ComponentsConfigurator extends AbstractResourceConfigurator {
   @Override
   public List<Component> defineComponents() {
      List<Component> all = new ArrayList<Component>();

      all.add(A(DefaultModuleManager.class));
      all.add(A(DefaultModuleInitializer.class));
      all.add(A(DefaultModuleContext.class));
      all.add(A(DateFormatter.class));
      all.add(A(LoggerThreadListener.class));

      return all;
   }

   public static void main(String[] args) {
      generatePlexusComponentsXmlFile(new ComponentsConfigurator());
   }
}
