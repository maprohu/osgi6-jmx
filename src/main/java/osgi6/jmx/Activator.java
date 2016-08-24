package osgi6.jmx;

import java.lang.management.ManagementFactory;
import javax.management.MBeanServer;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {
  public void start(BundleContext context) throws Exception {
    MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
    context.registerService(MBeanServer.class.getName(), mbs, null);
  }

  public void stop(BundleContext context) throws Exception {}
}