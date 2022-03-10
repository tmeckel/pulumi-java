// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Buildpack properties payload
 * 
 */
public final class BuildpackPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final BuildpackPropertiesArgs Empty = new BuildpackPropertiesArgs();

    /**
     * Id of the buildpack
     * 
     */
    @InputImport(name="id")
      private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    public BuildpackPropertiesArgs(@Nullable Input<String> id) {
        this.id = id;
    }

    private BuildpackPropertiesArgs() {
        this.id = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BuildpackPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> id;

        public Builder() {
    	      // Empty
        }

        public Builder(BuildpackPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder id(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }
        public BuildpackPropertiesArgs build() {
            return new BuildpackPropertiesArgs(id);
        }
    }
}
