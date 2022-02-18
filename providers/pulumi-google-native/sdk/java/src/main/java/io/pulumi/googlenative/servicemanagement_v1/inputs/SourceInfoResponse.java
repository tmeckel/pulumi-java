// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


/**
 * Source information used to create a Service Config
 * 
 */
public final class SourceInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final SourceInfoResponse Empty = new SourceInfoResponse();

    /**
     * All files used during config generation.
     * 
     */
    @InputImport(name="sourceFiles", required=true)
    private final List<Map<String,String>> sourceFiles;

    public List<Map<String,String>> getSourceFiles() {
        return this.sourceFiles;
    }

    public SourceInfoResponse(List<Map<String,String>> sourceFiles) {
        this.sourceFiles = Objects.requireNonNull(sourceFiles, "expected parameter 'sourceFiles' to be non-null");
    }

    private SourceInfoResponse() {
        this.sourceFiles = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<Map<String,String>> sourceFiles;

        public Builder() {
    	      // Empty
        }

        public Builder(SourceInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceFiles = defaults.sourceFiles;
        }

        public Builder setSourceFiles(List<Map<String,String>> sourceFiles) {
            this.sourceFiles = Objects.requireNonNull(sourceFiles);
            return this;
        }

        public SourceInfoResponse build() {
            return new SourceInfoResponse(sourceFiles);
        }
    }
}
