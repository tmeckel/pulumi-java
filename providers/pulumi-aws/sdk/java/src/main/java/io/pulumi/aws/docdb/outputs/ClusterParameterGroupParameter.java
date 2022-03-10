// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.docdb.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ClusterParameterGroupParameter {
    /**
     * Valid values are `immediate` and `pending-reboot`. Defaults to `pending-reboot`.
     * 
     */
    private final @Nullable String applyMethod;
    /**
     * The name of the documentDB parameter.
     * 
     */
    private final String name;
    /**
     * The value of the documentDB parameter.
     * 
     */
    private final String value;

    @OutputCustomType.Constructor
    private ClusterParameterGroupParameter(
        @OutputCustomType.Parameter("applyMethod") @Nullable String applyMethod,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("value") String value) {
        this.applyMethod = applyMethod;
        this.name = name;
        this.value = value;
    }

    /**
     * Valid values are `immediate` and `pending-reboot`. Defaults to `pending-reboot`.
     * 
    */
    public Optional<String> getApplyMethod() {
        return Optional.ofNullable(this.applyMethod);
    }
    /**
     * The name of the documentDB parameter.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The value of the documentDB parameter.
     * 
    */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterParameterGroupParameter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String applyMethod;
        private String name;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterParameterGroupParameter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applyMethod = defaults.applyMethod;
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder applyMethod(@Nullable String applyMethod) {
            this.applyMethod = applyMethod;
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public ClusterParameterGroupParameter build() {
            return new ClusterParameterGroupParameter(applyMethod, name, value);
        }
    }
}
