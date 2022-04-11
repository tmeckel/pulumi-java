// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1beta2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies an executable to run on a fully configured node and a timeout period for executable completion.
 * 
 */
public final class NodeInitializationActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final NodeInitializationActionArgs Empty = new NodeInitializationActionArgs();

    /**
     * Cloud Storage URI of executable file.
     * 
     */
    @Import(name="executableFile", required=true)
      private final Output<String> executableFile;

    public Output<String> getExecutableFile() {
        return this.executableFile;
    }

    /**
     * Optional. Amount of time executable has to complete. Default is 10 minutes (see JSON representation of Duration (https://developers.google.com/protocol-buffers/docs/proto3#json)).Cluster creation fails with an explanatory error message (the name of the executable that caused the error and the exceeded timeout period) if the executable is not completed at end of the timeout period.
     * 
     */
    @Import(name="executionTimeout")
      private final @Nullable Output<String> executionTimeout;

    public Output<String> getExecutionTimeout() {
        return this.executionTimeout == null ? Codegen.empty() : this.executionTimeout;
    }

    public NodeInitializationActionArgs(
        Output<String> executableFile,
        @Nullable Output<String> executionTimeout) {
        this.executableFile = Objects.requireNonNull(executableFile, "expected parameter 'executableFile' to be non-null");
        this.executionTimeout = executionTimeout;
    }

    private NodeInitializationActionArgs() {
        this.executableFile = Codegen.empty();
        this.executionTimeout = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeInitializationActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> executableFile;
        private @Nullable Output<String> executionTimeout;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeInitializationActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.executableFile = defaults.executableFile;
    	      this.executionTimeout = defaults.executionTimeout;
        }

        public Builder executableFile(Output<String> executableFile) {
            this.executableFile = Objects.requireNonNull(executableFile);
            return this;
        }
        public Builder executableFile(String executableFile) {
            this.executableFile = Output.of(Objects.requireNonNull(executableFile));
            return this;
        }
        public Builder executionTimeout(@Nullable Output<String> executionTimeout) {
            this.executionTimeout = executionTimeout;
            return this;
        }
        public Builder executionTimeout(@Nullable String executionTimeout) {
            this.executionTimeout = Codegen.ofNullable(executionTimeout);
            return this;
        }        public NodeInitializationActionArgs build() {
            return new NodeInitializationActionArgs(executableFile, executionTimeout);
        }
    }
}
