// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Redirect incompatible row settings
 * 
 */
public final class RedirectIncompatibleRowSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final RedirectIncompatibleRowSettingsArgs Empty = new RedirectIncompatibleRowSettingsArgs();

    /**
     * Name of the Azure Storage, Storage SAS, or Azure Data Lake Store linked service used for redirecting incompatible row. Must be specified if redirectIncompatibleRowSettings is specified. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="linkedServiceName", required=true)
      private final Output<Object> linkedServiceName;

    public Output<Object> getLinkedServiceName() {
        return this.linkedServiceName;
    }

    /**
     * The path for storing the redirect incompatible row data. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="path")
      private final @Nullable Output<Object> path;

    public Output<Object> getPath() {
        return this.path == null ? Codegen.empty() : this.path;
    }

    public RedirectIncompatibleRowSettingsArgs(
        Output<Object> linkedServiceName,
        @Nullable Output<Object> path) {
        this.linkedServiceName = Objects.requireNonNull(linkedServiceName, "expected parameter 'linkedServiceName' to be non-null");
        this.path = path;
    }

    private RedirectIncompatibleRowSettingsArgs() {
        this.linkedServiceName = Codegen.empty();
        this.path = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RedirectIncompatibleRowSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Object> linkedServiceName;
        private @Nullable Output<Object> path;

        public Builder() {
    	      // Empty
        }

        public Builder(RedirectIncompatibleRowSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.path = defaults.path;
        }

        public Builder linkedServiceName(Output<Object> linkedServiceName) {
            this.linkedServiceName = Objects.requireNonNull(linkedServiceName);
            return this;
        }
        public Builder linkedServiceName(Object linkedServiceName) {
            this.linkedServiceName = Output.of(Objects.requireNonNull(linkedServiceName));
            return this;
        }
        public Builder path(@Nullable Output<Object> path) {
            this.path = path;
            return this;
        }
        public Builder path(@Nullable Object path) {
            this.path = Codegen.ofNullable(path);
            return this;
        }        public RedirectIncompatibleRowSettingsArgs build() {
            return new RedirectIncompatibleRowSettingsArgs(linkedServiceName, path);
        }
    }
}
