// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * App Engine service. Learn more at https://cloud.google.com/appengine.
 * 
 */
public final class AppEngineArgs extends io.pulumi.resources.ResourceArgs {

    public static final AppEngineArgs Empty = new AppEngineArgs();

    /**
     * The ID of the App Engine module underlying this service. Corresponds to the module_id resource label in the gae_app monitored resource: https://cloud.google.com/monitoring/api/resources#tag_gae_app
     * 
     */
    @InputImport(name="moduleId")
    private final @Nullable Input<String> moduleId;

    public Input<String> getModuleId() {
        return this.moduleId == null ? Input.empty() : this.moduleId;
    }

    public AppEngineArgs(@Nullable Input<String> moduleId) {
        this.moduleId = moduleId;
    }

    private AppEngineArgs() {
        this.moduleId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppEngineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> moduleId;

        public Builder() {
    	      // Empty
        }

        public Builder(AppEngineArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.moduleId = defaults.moduleId;
        }

        public Builder setModuleId(@Nullable Input<String> moduleId) {
            this.moduleId = moduleId;
            return this;
        }

        public Builder setModuleId(@Nullable String moduleId) {
            this.moduleId = Input.ofNullable(moduleId);
            return this;
        }

        public AppEngineArgs build() {
            return new AppEngineArgs(moduleId);
        }
    }
}
