// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.composer_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The configuration settings for the Airflow web server App Engine instance. Supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
 * 
 */
public final class WebServerConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebServerConfigArgs Empty = new WebServerConfigArgs();

    /**
     * Optional. Machine type on which Airflow web server is running. It has to be one of: composer-n1-webserver-2, composer-n1-webserver-4 or composer-n1-webserver-8. If not specified, composer-n1-webserver-2 will be used. Value custom is returned only in response, if Airflow web server parameters were manually changed to a non-standard values.
     * 
     */
    @InputImport(name="machineType")
    private final @Nullable Input<String> machineType;

    public Input<String> getMachineType() {
        return this.machineType == null ? Input.empty() : this.machineType;
    }

    public WebServerConfigArgs(@Nullable Input<String> machineType) {
        this.machineType = machineType;
    }

    private WebServerConfigArgs() {
        this.machineType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebServerConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> machineType;

        public Builder() {
    	      // Empty
        }

        public Builder(WebServerConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.machineType = defaults.machineType;
        }

        public Builder setMachineType(@Nullable Input<String> machineType) {
            this.machineType = machineType;
            return this;
        }

        public Builder setMachineType(@Nullable String machineType) {
            this.machineType = Input.ofNullable(machineType);
            return this;
        }

        public WebServerConfigArgs build() {
            return new WebServerConfigArgs(machineType);
        }
    }
}
