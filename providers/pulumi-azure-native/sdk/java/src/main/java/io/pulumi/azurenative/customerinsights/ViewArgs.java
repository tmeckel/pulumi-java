// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ViewArgs extends io.pulumi.resources.ResourceArgs {

    public static final ViewArgs Empty = new ViewArgs();

    /**
     * View definition.
     * 
     */
    @Import(name="definition", required=true)
      private final Output<String> definition;

    public Output<String> getDefinition() {
        return this.definition;
    }

    /**
     * Localized display name for the view.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<Map<String,String>> displayName;

    public Output<Map<String,String>> getDisplayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    /**
     * The name of the hub.
     * 
     */
    @Import(name="hubName", required=true)
      private final Output<String> hubName;

    public Output<String> getHubName() {
        return this.hubName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * the user ID.
     * 
     */
    @Import(name="userId")
      private final @Nullable Output<String> userId;

    public Output<String> getUserId() {
        return this.userId == null ? Codegen.empty() : this.userId;
    }

    /**
     * The name of the view.
     * 
     */
    @Import(name="viewName")
      private final @Nullable Output<String> viewName;

    public Output<String> getViewName() {
        return this.viewName == null ? Codegen.empty() : this.viewName;
    }

    public ViewArgs(
        Output<String> definition,
        @Nullable Output<Map<String,String>> displayName,
        Output<String> hubName,
        Output<String> resourceGroupName,
        @Nullable Output<String> userId,
        @Nullable Output<String> viewName) {
        this.definition = Objects.requireNonNull(definition, "expected parameter 'definition' to be non-null");
        this.displayName = displayName;
        this.hubName = Objects.requireNonNull(hubName, "expected parameter 'hubName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.userId = userId;
        this.viewName = viewName;
    }

    private ViewArgs() {
        this.definition = Codegen.empty();
        this.displayName = Codegen.empty();
        this.hubName = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.userId = Codegen.empty();
        this.viewName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ViewArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> definition;
        private @Nullable Output<Map<String,String>> displayName;
        private Output<String> hubName;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> userId;
        private @Nullable Output<String> viewName;

        public Builder() {
    	      // Empty
        }

        public Builder(ViewArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.definition = defaults.definition;
    	      this.displayName = defaults.displayName;
    	      this.hubName = defaults.hubName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.userId = defaults.userId;
    	      this.viewName = defaults.viewName;
        }

        public Builder definition(Output<String> definition) {
            this.definition = Objects.requireNonNull(definition);
            return this;
        }
        public Builder definition(String definition) {
            this.definition = Output.of(Objects.requireNonNull(definition));
            return this;
        }
        public Builder displayName(@Nullable Output<Map<String,String>> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable Map<String,String> displayName) {
            this.displayName = Codegen.ofNullable(displayName);
            return this;
        }
        public Builder hubName(Output<String> hubName) {
            this.hubName = Objects.requireNonNull(hubName);
            return this;
        }
        public Builder hubName(String hubName) {
            this.hubName = Output.of(Objects.requireNonNull(hubName));
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder userId(@Nullable Output<String> userId) {
            this.userId = userId;
            return this;
        }
        public Builder userId(@Nullable String userId) {
            this.userId = Codegen.ofNullable(userId);
            return this;
        }
        public Builder viewName(@Nullable Output<String> viewName) {
            this.viewName = viewName;
            return this;
        }
        public Builder viewName(@Nullable String viewName) {
            this.viewName = Codegen.ofNullable(viewName);
            return this;
        }        public ViewArgs build() {
            return new ViewArgs(definition, displayName, hubName, resourceGroupName, userId, viewName);
        }
    }
}
