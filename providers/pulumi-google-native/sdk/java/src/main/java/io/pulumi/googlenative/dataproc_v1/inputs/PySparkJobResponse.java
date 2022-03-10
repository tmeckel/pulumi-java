// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dataproc_v1.inputs.LoggingConfigResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


/**
 * A Dataproc job for running Apache PySpark (https://spark.apache.org/docs/0.9.0/python-programming-guide.html) applications on YARN.
 * 
 */
public final class PySparkJobResponse extends io.pulumi.resources.InvokeArgs {

    public static final PySparkJobResponse Empty = new PySparkJobResponse();

    /**
     * Optional. HCFS URIs of archives to be extracted into the working directory of each executor. Supported file types: .jar, .tar, .tar.gz, .tgz, and .zip.
     * 
     */
    @InputImport(name="archiveUris", required=true)
      private final List<String> archiveUris;

    public List<String> getArchiveUris() {
        return this.archiveUris;
    }

    /**
     * Optional. The arguments to pass to the driver. Do not include arguments, such as --conf, that can be set as job properties, since a collision may occur that causes an incorrect job submission.
     * 
     */
    @InputImport(name="args", required=true)
      private final List<String> args;

    public List<String> getArgs() {
        return this.args;
    }

    /**
     * Optional. HCFS URIs of files to be placed in the working directory of each executor. Useful for naively parallel tasks.
     * 
     */
    @InputImport(name="fileUris", required=true)
      private final List<String> fileUris;

    public List<String> getFileUris() {
        return this.fileUris;
    }

    /**
     * Optional. HCFS URIs of jar files to add to the CLASSPATHs of the Python driver and tasks.
     * 
     */
    @InputImport(name="jarFileUris", required=true)
      private final List<String> jarFileUris;

    public List<String> getJarFileUris() {
        return this.jarFileUris;
    }

    /**
     * Optional. The runtime log config for job execution.
     * 
     */
    @InputImport(name="loggingConfig", required=true)
      private final LoggingConfigResponse loggingConfig;

    public LoggingConfigResponse getLoggingConfig() {
        return this.loggingConfig;
    }

    /**
     * The HCFS URI of the main Python file to use as the driver. Must be a .py file.
     * 
     */
    @InputImport(name="mainPythonFileUri", required=true)
      private final String mainPythonFileUri;

    public String getMainPythonFileUri() {
        return this.mainPythonFileUri;
    }

    /**
     * Optional. A mapping of property names to values, used to configure PySpark. Properties that conflict with values set by the Dataproc API may be overwritten. Can include properties set in /etc/spark/conf/spark-defaults.conf and classes in user code.
     * 
     */
    @InputImport(name="properties", required=true)
      private final Map<String,String> properties;

    public Map<String,String> getProperties() {
        return this.properties;
    }

    /**
     * Optional. HCFS file URIs of Python files to pass to the PySpark framework. Supported file types: .py, .egg, and .zip.
     * 
     */
    @InputImport(name="pythonFileUris", required=true)
      private final List<String> pythonFileUris;

    public List<String> getPythonFileUris() {
        return this.pythonFileUris;
    }

    public PySparkJobResponse(
        List<String> archiveUris,
        List<String> args,
        List<String> fileUris,
        List<String> jarFileUris,
        LoggingConfigResponse loggingConfig,
        String mainPythonFileUri,
        Map<String,String> properties,
        List<String> pythonFileUris) {
        this.archiveUris = Objects.requireNonNull(archiveUris, "expected parameter 'archiveUris' to be non-null");
        this.args = Objects.requireNonNull(args, "expected parameter 'args' to be non-null");
        this.fileUris = Objects.requireNonNull(fileUris, "expected parameter 'fileUris' to be non-null");
        this.jarFileUris = Objects.requireNonNull(jarFileUris, "expected parameter 'jarFileUris' to be non-null");
        this.loggingConfig = Objects.requireNonNull(loggingConfig, "expected parameter 'loggingConfig' to be non-null");
        this.mainPythonFileUri = Objects.requireNonNull(mainPythonFileUri, "expected parameter 'mainPythonFileUri' to be non-null");
        this.properties = Objects.requireNonNull(properties, "expected parameter 'properties' to be non-null");
        this.pythonFileUris = Objects.requireNonNull(pythonFileUris, "expected parameter 'pythonFileUris' to be non-null");
    }

    private PySparkJobResponse() {
        this.archiveUris = List.of();
        this.args = List.of();
        this.fileUris = List.of();
        this.jarFileUris = List.of();
        this.loggingConfig = null;
        this.mainPythonFileUri = null;
        this.properties = Map.of();
        this.pythonFileUris = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PySparkJobResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> archiveUris;
        private List<String> args;
        private List<String> fileUris;
        private List<String> jarFileUris;
        private LoggingConfigResponse loggingConfig;
        private String mainPythonFileUri;
        private Map<String,String> properties;
        private List<String> pythonFileUris;

        public Builder() {
    	      // Empty
        }

        public Builder(PySparkJobResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.archiveUris = defaults.archiveUris;
    	      this.args = defaults.args;
    	      this.fileUris = defaults.fileUris;
    	      this.jarFileUris = defaults.jarFileUris;
    	      this.loggingConfig = defaults.loggingConfig;
    	      this.mainPythonFileUri = defaults.mainPythonFileUri;
    	      this.properties = defaults.properties;
    	      this.pythonFileUris = defaults.pythonFileUris;
        }

        public Builder archiveUris(List<String> archiveUris) {
            this.archiveUris = Objects.requireNonNull(archiveUris);
            return this;
        }

        public Builder args(List<String> args) {
            this.args = Objects.requireNonNull(args);
            return this;
        }

        public Builder fileUris(List<String> fileUris) {
            this.fileUris = Objects.requireNonNull(fileUris);
            return this;
        }

        public Builder jarFileUris(List<String> jarFileUris) {
            this.jarFileUris = Objects.requireNonNull(jarFileUris);
            return this;
        }

        public Builder loggingConfig(LoggingConfigResponse loggingConfig) {
            this.loggingConfig = Objects.requireNonNull(loggingConfig);
            return this;
        }

        public Builder mainPythonFileUri(String mainPythonFileUri) {
            this.mainPythonFileUri = Objects.requireNonNull(mainPythonFileUri);
            return this;
        }

        public Builder properties(Map<String,String> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder pythonFileUris(List<String> pythonFileUris) {
            this.pythonFileUris = Objects.requireNonNull(pythonFileUris);
            return this;
        }
        public PySparkJobResponse build() {
            return new PySparkJobResponse(archiveUris, args, fileUris, jarFileUris, loggingConfig, mainPythonFileUri, properties, pythonFileUris);
        }
    }
}
