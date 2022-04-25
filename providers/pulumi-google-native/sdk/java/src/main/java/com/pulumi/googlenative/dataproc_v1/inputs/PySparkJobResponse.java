// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dataproc_v1.inputs.LoggingConfigResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


/**
 * A Dataproc job for running Apache PySpark (https://spark.apache.org/docs/0.9.0/python-programming-guide.html) applications on YARN.
 * 
 */
public final class PySparkJobResponse extends com.pulumi.resources.InvokeArgs {

    public static final PySparkJobResponse Empty = new PySparkJobResponse();

    /**
     * Optional. HCFS URIs of archives to be extracted into the working directory of each executor. Supported file types: .jar, .tar, .tar.gz, .tgz, and .zip.
     * 
     */
    @Import(name="archiveUris", required=true)
    private List<String> archiveUris;

    /**
     * @return Optional. HCFS URIs of archives to be extracted into the working directory of each executor. Supported file types: .jar, .tar, .tar.gz, .tgz, and .zip.
     * 
     */
    public List<String> archiveUris() {
        return this.archiveUris;
    }

    /**
     * Optional. The arguments to pass to the driver. Do not include arguments, such as --conf, that can be set as job properties, since a collision may occur that causes an incorrect job submission.
     * 
     */
    @Import(name="args", required=true)
    private List<String> args;

    /**
     * @return Optional. The arguments to pass to the driver. Do not include arguments, such as --conf, that can be set as job properties, since a collision may occur that causes an incorrect job submission.
     * 
     */
    public List<String> args() {
        return this.args;
    }

    /**
     * Optional. HCFS URIs of files to be placed in the working directory of each executor. Useful for naively parallel tasks.
     * 
     */
    @Import(name="fileUris", required=true)
    private List<String> fileUris;

    /**
     * @return Optional. HCFS URIs of files to be placed in the working directory of each executor. Useful for naively parallel tasks.
     * 
     */
    public List<String> fileUris() {
        return this.fileUris;
    }

    /**
     * Optional. HCFS URIs of jar files to add to the CLASSPATHs of the Python driver and tasks.
     * 
     */
    @Import(name="jarFileUris", required=true)
    private List<String> jarFileUris;

    /**
     * @return Optional. HCFS URIs of jar files to add to the CLASSPATHs of the Python driver and tasks.
     * 
     */
    public List<String> jarFileUris() {
        return this.jarFileUris;
    }

    /**
     * Optional. The runtime log config for job execution.
     * 
     */
    @Import(name="loggingConfig", required=true)
    private LoggingConfigResponse loggingConfig;

    /**
     * @return Optional. The runtime log config for job execution.
     * 
     */
    public LoggingConfigResponse loggingConfig() {
        return this.loggingConfig;
    }

    /**
     * The HCFS URI of the main Python file to use as the driver. Must be a .py file.
     * 
     */
    @Import(name="mainPythonFileUri", required=true)
    private String mainPythonFileUri;

    /**
     * @return The HCFS URI of the main Python file to use as the driver. Must be a .py file.
     * 
     */
    public String mainPythonFileUri() {
        return this.mainPythonFileUri;
    }

    /**
     * Optional. A mapping of property names to values, used to configure PySpark. Properties that conflict with values set by the Dataproc API may be overwritten. Can include properties set in /etc/spark/conf/spark-defaults.conf and classes in user code.
     * 
     */
    @Import(name="properties", required=true)
    private Map<String,String> properties;

    /**
     * @return Optional. A mapping of property names to values, used to configure PySpark. Properties that conflict with values set by the Dataproc API may be overwritten. Can include properties set in /etc/spark/conf/spark-defaults.conf and classes in user code.
     * 
     */
    public Map<String,String> properties() {
        return this.properties;
    }

    /**
     * Optional. HCFS file URIs of Python files to pass to the PySpark framework. Supported file types: .py, .egg, and .zip.
     * 
     */
    @Import(name="pythonFileUris", required=true)
    private List<String> pythonFileUris;

    /**
     * @return Optional. HCFS file URIs of Python files to pass to the PySpark framework. Supported file types: .py, .egg, and .zip.
     * 
     */
    public List<String> pythonFileUris() {
        return this.pythonFileUris;
    }

    private PySparkJobResponse() {}

    private PySparkJobResponse(PySparkJobResponse $) {
        this.archiveUris = $.archiveUris;
        this.args = $.args;
        this.fileUris = $.fileUris;
        this.jarFileUris = $.jarFileUris;
        this.loggingConfig = $.loggingConfig;
        this.mainPythonFileUri = $.mainPythonFileUri;
        this.properties = $.properties;
        this.pythonFileUris = $.pythonFileUris;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PySparkJobResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PySparkJobResponse $;

        public Builder() {
            $ = new PySparkJobResponse();
        }

        public Builder(PySparkJobResponse defaults) {
            $ = new PySparkJobResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param archiveUris Optional. HCFS URIs of archives to be extracted into the working directory of each executor. Supported file types: .jar, .tar, .tar.gz, .tgz, and .zip.
         * 
         * @return builder
         * 
         */
        public Builder archiveUris(List<String> archiveUris) {
            $.archiveUris = archiveUris;
            return this;
        }

        /**
         * @param archiveUris Optional. HCFS URIs of archives to be extracted into the working directory of each executor. Supported file types: .jar, .tar, .tar.gz, .tgz, and .zip.
         * 
         * @return builder
         * 
         */
        public Builder archiveUris(String... archiveUris) {
            return archiveUris(List.of(archiveUris));
        }

        /**
         * @param args Optional. The arguments to pass to the driver. Do not include arguments, such as --conf, that can be set as job properties, since a collision may occur that causes an incorrect job submission.
         * 
         * @return builder
         * 
         */
        public Builder args(List<String> args) {
            $.args = args;
            return this;
        }

        /**
         * @param args Optional. The arguments to pass to the driver. Do not include arguments, such as --conf, that can be set as job properties, since a collision may occur that causes an incorrect job submission.
         * 
         * @return builder
         * 
         */
        public Builder args(String... args) {
            return args(List.of(args));
        }

        /**
         * @param fileUris Optional. HCFS URIs of files to be placed in the working directory of each executor. Useful for naively parallel tasks.
         * 
         * @return builder
         * 
         */
        public Builder fileUris(List<String> fileUris) {
            $.fileUris = fileUris;
            return this;
        }

        /**
         * @param fileUris Optional. HCFS URIs of files to be placed in the working directory of each executor. Useful for naively parallel tasks.
         * 
         * @return builder
         * 
         */
        public Builder fileUris(String... fileUris) {
            return fileUris(List.of(fileUris));
        }

        /**
         * @param jarFileUris Optional. HCFS URIs of jar files to add to the CLASSPATHs of the Python driver and tasks.
         * 
         * @return builder
         * 
         */
        public Builder jarFileUris(List<String> jarFileUris) {
            $.jarFileUris = jarFileUris;
            return this;
        }

        /**
         * @param jarFileUris Optional. HCFS URIs of jar files to add to the CLASSPATHs of the Python driver and tasks.
         * 
         * @return builder
         * 
         */
        public Builder jarFileUris(String... jarFileUris) {
            return jarFileUris(List.of(jarFileUris));
        }

        /**
         * @param loggingConfig Optional. The runtime log config for job execution.
         * 
         * @return builder
         * 
         */
        public Builder loggingConfig(LoggingConfigResponse loggingConfig) {
            $.loggingConfig = loggingConfig;
            return this;
        }

        /**
         * @param mainPythonFileUri The HCFS URI of the main Python file to use as the driver. Must be a .py file.
         * 
         * @return builder
         * 
         */
        public Builder mainPythonFileUri(String mainPythonFileUri) {
            $.mainPythonFileUri = mainPythonFileUri;
            return this;
        }

        /**
         * @param properties Optional. A mapping of property names to values, used to configure PySpark. Properties that conflict with values set by the Dataproc API may be overwritten. Can include properties set in /etc/spark/conf/spark-defaults.conf and classes in user code.
         * 
         * @return builder
         * 
         */
        public Builder properties(Map<String,String> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param pythonFileUris Optional. HCFS file URIs of Python files to pass to the PySpark framework. Supported file types: .py, .egg, and .zip.
         * 
         * @return builder
         * 
         */
        public Builder pythonFileUris(List<String> pythonFileUris) {
            $.pythonFileUris = pythonFileUris;
            return this;
        }

        /**
         * @param pythonFileUris Optional. HCFS file URIs of Python files to pass to the PySpark framework. Supported file types: .py, .egg, and .zip.
         * 
         * @return builder
         * 
         */
        public Builder pythonFileUris(String... pythonFileUris) {
            return pythonFileUris(List.of(pythonFileUris));
        }

        public PySparkJobResponse build() {
            $.archiveUris = Objects.requireNonNull($.archiveUris, "expected parameter 'archiveUris' to be non-null");
            $.args = Objects.requireNonNull($.args, "expected parameter 'args' to be non-null");
            $.fileUris = Objects.requireNonNull($.fileUris, "expected parameter 'fileUris' to be non-null");
            $.jarFileUris = Objects.requireNonNull($.jarFileUris, "expected parameter 'jarFileUris' to be non-null");
            $.loggingConfig = Objects.requireNonNull($.loggingConfig, "expected parameter 'loggingConfig' to be non-null");
            $.mainPythonFileUri = Objects.requireNonNull($.mainPythonFileUri, "expected parameter 'mainPythonFileUri' to be non-null");
            $.properties = Objects.requireNonNull($.properties, "expected parameter 'properties' to be non-null");
            $.pythonFileUris = Objects.requireNonNull($.pythonFileUris, "expected parameter 'pythonFileUris' to be non-null");
            return $;
        }
    }

}
