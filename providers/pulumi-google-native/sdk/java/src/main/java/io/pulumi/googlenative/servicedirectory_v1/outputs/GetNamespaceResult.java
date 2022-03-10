// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicedirectory_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetNamespaceResult {
    /**
     * Optional. Resource labels associated with this namespace. No more than 64 user labels can be associated with a given resource. Label keys and values can be no longer than 63 characters.
     * 
     */
    private final Map<String,String> labels;
    /**
     * Immutable. The resource name for the namespace in the format `projects/*{@literal /}locations/*{@literal /}namespaces/*`.
     * 
     */
    private final String name;

    @OutputCustomType.Constructor
    private GetNamespaceResult(
        @OutputCustomType.Parameter("labels") Map<String,String> labels,
        @OutputCustomType.Parameter("name") String name) {
        this.labels = labels;
        this.name = name;
    }

    /**
     * Optional. Resource labels associated with this namespace. No more than 64 user labels can be associated with a given resource. Label keys and values can be no longer than 63 characters.
     * 
    */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * Immutable. The resource name for the namespace in the format `projects/*{@literal /}locations/*{@literal /}namespaces/*`.
     * 
    */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNamespaceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> labels;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNamespaceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
        }

        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public GetNamespaceResult build() {
            return new GetNamespaceResult(labels, name);
        }
    }
}
