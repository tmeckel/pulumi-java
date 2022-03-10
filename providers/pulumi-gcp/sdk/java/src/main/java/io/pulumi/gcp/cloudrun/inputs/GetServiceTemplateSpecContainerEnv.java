// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.cloudrun.inputs.GetServiceTemplateSpecContainerEnvValueFrom;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetServiceTemplateSpecContainerEnv extends io.pulumi.resources.InvokeArgs {

    public static final GetServiceTemplateSpecContainerEnv Empty = new GetServiceTemplateSpecContainerEnv();

    /**
     * The name of the Cloud Run Service.
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    @InputImport(name="value", required=true)
      private final String value;

    public String getValue() {
        return this.value;
    }

    @InputImport(name="valueFroms", required=true)
      private final List<GetServiceTemplateSpecContainerEnvValueFrom> valueFroms;

    public List<GetServiceTemplateSpecContainerEnvValueFrom> getValueFroms() {
        return this.valueFroms;
    }

    public GetServiceTemplateSpecContainerEnv(
        String name,
        String value,
        List<GetServiceTemplateSpecContainerEnvValueFrom> valueFroms) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
        this.valueFroms = Objects.requireNonNull(valueFroms, "expected parameter 'valueFroms' to be non-null");
    }

    private GetServiceTemplateSpecContainerEnv() {
        this.name = null;
        this.value = null;
        this.valueFroms = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceTemplateSpecContainerEnv defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String value;
        private List<GetServiceTemplateSpecContainerEnvValueFrom> valueFroms;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceTemplateSpecContainerEnv defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
    	      this.valueFroms = defaults.valueFroms;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder valueFroms(List<GetServiceTemplateSpecContainerEnvValueFrom> valueFroms) {
            this.valueFroms = Objects.requireNonNull(valueFroms);
            return this;
        }
        public GetServiceTemplateSpecContainerEnv build() {
            return new GetServiceTemplateSpecContainerEnv(name, value, valueFroms);
        }
    }
}
