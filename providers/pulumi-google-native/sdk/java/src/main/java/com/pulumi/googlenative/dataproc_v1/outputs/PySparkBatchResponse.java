// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class PySparkBatchResponse {
    /**
     * @return Optional. HCFS URIs of archives to be extracted into the working directory of each executor. Supported file types: .jar, .tar, .tar.gz, .tgz, and .zip.
     * 
     */
    private final List<String> archiveUris;
    /**
     * @return Optional. The arguments to pass to the driver. Do not include arguments that can be set as batch properties, such as --conf, since a collision can occur that causes an incorrect batch submission.
     * 
     */
    private final List<String> args;
    /**
     * @return Optional. HCFS URIs of files to be placed in the working directory of each executor.
     * 
     */
    private final List<String> fileUris;
    /**
     * @return Optional. HCFS URIs of jar files to add to the classpath of the Spark driver and tasks.
     * 
     */
    private final List<String> jarFileUris;
    /**
     * @return The HCFS URI of the main Python file to use as the Spark driver. Must be a .py file.
     * 
     */
    private final String mainPythonFileUri;
    /**
     * @return Optional. HCFS file URIs of Python files to pass to the PySpark framework. Supported file types: .py, .egg, and .zip.
     * 
     */
    private final List<String> pythonFileUris;

    @CustomType.Constructor
    private PySparkBatchResponse(
        @CustomType.Parameter("archiveUris") List<String> archiveUris,
        @CustomType.Parameter("args") List<String> args,
        @CustomType.Parameter("fileUris") List<String> fileUris,
        @CustomType.Parameter("jarFileUris") List<String> jarFileUris,
        @CustomType.Parameter("mainPythonFileUri") String mainPythonFileUri,
        @CustomType.Parameter("pythonFileUris") List<String> pythonFileUris) {
        this.archiveUris = archiveUris;
        this.args = args;
        this.fileUris = fileUris;
        this.jarFileUris = jarFileUris;
        this.mainPythonFileUri = mainPythonFileUri;
        this.pythonFileUris = pythonFileUris;
    }

    /**
     * @return Optional. HCFS URIs of archives to be extracted into the working directory of each executor. Supported file types: .jar, .tar, .tar.gz, .tgz, and .zip.
     * 
     */
    public List<String> archiveUris() {
        return this.archiveUris;
    }
    /**
     * @return Optional. The arguments to pass to the driver. Do not include arguments that can be set as batch properties, such as --conf, since a collision can occur that causes an incorrect batch submission.
     * 
     */
    public List<String> args() {
        return this.args;
    }
    /**
     * @return Optional. HCFS URIs of files to be placed in the working directory of each executor.
     * 
     */
    public List<String> fileUris() {
        return this.fileUris;
    }
    /**
     * @return Optional. HCFS URIs of jar files to add to the classpath of the Spark driver and tasks.
     * 
     */
    public List<String> jarFileUris() {
        return this.jarFileUris;
    }
    /**
     * @return The HCFS URI of the main Python file to use as the Spark driver. Must be a .py file.
     * 
     */
    public String mainPythonFileUri() {
        return this.mainPythonFileUri;
    }
    /**
     * @return Optional. HCFS file URIs of Python files to pass to the PySpark framework. Supported file types: .py, .egg, and .zip.
     * 
     */
    public List<String> pythonFileUris() {
        return this.pythonFileUris;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PySparkBatchResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> archiveUris;
        private List<String> args;
        private List<String> fileUris;
        private List<String> jarFileUris;
        private String mainPythonFileUri;
        private List<String> pythonFileUris;

        public Builder() {
    	      // Empty
        }

        public Builder(PySparkBatchResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.archiveUris = defaults.archiveUris;
    	      this.args = defaults.args;
    	      this.fileUris = defaults.fileUris;
    	      this.jarFileUris = defaults.jarFileUris;
    	      this.mainPythonFileUri = defaults.mainPythonFileUri;
    	      this.pythonFileUris = defaults.pythonFileUris;
        }

        public Builder archiveUris(List<String> archiveUris) {
            this.archiveUris = Objects.requireNonNull(archiveUris);
            return this;
        }
        public Builder archiveUris(String... archiveUris) {
            return archiveUris(List.of(archiveUris));
        }
        public Builder args(List<String> args) {
            this.args = Objects.requireNonNull(args);
            return this;
        }
        public Builder args(String... args) {
            return args(List.of(args));
        }
        public Builder fileUris(List<String> fileUris) {
            this.fileUris = Objects.requireNonNull(fileUris);
            return this;
        }
        public Builder fileUris(String... fileUris) {
            return fileUris(List.of(fileUris));
        }
        public Builder jarFileUris(List<String> jarFileUris) {
            this.jarFileUris = Objects.requireNonNull(jarFileUris);
            return this;
        }
        public Builder jarFileUris(String... jarFileUris) {
            return jarFileUris(List.of(jarFileUris));
        }
        public Builder mainPythonFileUri(String mainPythonFileUri) {
            this.mainPythonFileUri = Objects.requireNonNull(mainPythonFileUri);
            return this;
        }
        public Builder pythonFileUris(List<String> pythonFileUris) {
            this.pythonFileUris = Objects.requireNonNull(pythonFileUris);
            return this;
        }
        public Builder pythonFileUris(String... pythonFileUris) {
            return pythonFileUris(List.of(pythonFileUris));
        }        public PySparkBatchResponse build() {
            return new PySparkBatchResponse(archiveUris, args, fileUris, jarFileUris, mainPythonFileUri, pythonFileUris);
        }
    }
}
