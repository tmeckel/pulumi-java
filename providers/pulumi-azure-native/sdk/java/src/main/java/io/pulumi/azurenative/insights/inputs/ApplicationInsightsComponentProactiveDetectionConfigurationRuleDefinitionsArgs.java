// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Static definitions of the ProactiveDetection configuration rule (same values for all components).
 * 
 */
public final class ApplicationInsightsComponentProactiveDetectionConfigurationRuleDefinitionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationInsightsComponentProactiveDetectionConfigurationRuleDefinitionsArgs Empty = new ApplicationInsightsComponentProactiveDetectionConfigurationRuleDefinitionsArgs();

    /**
     * The rule description
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The rule name as it is displayed in UI
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    /**
     * URL which displays additional info about the proactive detection rule
     * 
     */
    @Import(name="helpUrl")
      private final @Nullable Output<String> helpUrl;

    public Output<String> getHelpUrl() {
        return this.helpUrl == null ? Codegen.empty() : this.helpUrl;
    }

    /**
     * A flag indicating whether the rule is enabled by default
     * 
     */
    @Import(name="isEnabledByDefault")
      private final @Nullable Output<Boolean> isEnabledByDefault;

    public Output<Boolean> getIsEnabledByDefault() {
        return this.isEnabledByDefault == null ? Codegen.empty() : this.isEnabledByDefault;
    }

    /**
     * A flag indicating whether the rule is hidden (from the UI)
     * 
     */
    @Import(name="isHidden")
      private final @Nullable Output<Boolean> isHidden;

    public Output<Boolean> getIsHidden() {
        return this.isHidden == null ? Codegen.empty() : this.isHidden;
    }

    /**
     * A flag indicating whether the rule is in preview
     * 
     */
    @Import(name="isInPreview")
      private final @Nullable Output<Boolean> isInPreview;

    public Output<Boolean> getIsInPreview() {
        return this.isInPreview == null ? Codegen.empty() : this.isInPreview;
    }

    /**
     * The rule name
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * A flag indicating whether email notifications are supported for detections for this rule
     * 
     */
    @Import(name="supportsEmailNotifications")
      private final @Nullable Output<Boolean> supportsEmailNotifications;

    public Output<Boolean> getSupportsEmailNotifications() {
        return this.supportsEmailNotifications == null ? Codegen.empty() : this.supportsEmailNotifications;
    }

    public ApplicationInsightsComponentProactiveDetectionConfigurationRuleDefinitionsArgs(
        @Nullable Output<String> description,
        @Nullable Output<String> displayName,
        @Nullable Output<String> helpUrl,
        @Nullable Output<Boolean> isEnabledByDefault,
        @Nullable Output<Boolean> isHidden,
        @Nullable Output<Boolean> isInPreview,
        @Nullable Output<String> name,
        @Nullable Output<Boolean> supportsEmailNotifications) {
        this.description = description;
        this.displayName = displayName;
        this.helpUrl = helpUrl;
        this.isEnabledByDefault = isEnabledByDefault;
        this.isHidden = isHidden;
        this.isInPreview = isInPreview;
        this.name = name;
        this.supportsEmailNotifications = supportsEmailNotifications;
    }

    private ApplicationInsightsComponentProactiveDetectionConfigurationRuleDefinitionsArgs() {
        this.description = Codegen.empty();
        this.displayName = Codegen.empty();
        this.helpUrl = Codegen.empty();
        this.isEnabledByDefault = Codegen.empty();
        this.isHidden = Codegen.empty();
        this.isInPreview = Codegen.empty();
        this.name = Codegen.empty();
        this.supportsEmailNotifications = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationInsightsComponentProactiveDetectionConfigurationRuleDefinitionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> displayName;
        private @Nullable Output<String> helpUrl;
        private @Nullable Output<Boolean> isEnabledByDefault;
        private @Nullable Output<Boolean> isHidden;
        private @Nullable Output<Boolean> isInPreview;
        private @Nullable Output<String> name;
        private @Nullable Output<Boolean> supportsEmailNotifications;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationInsightsComponentProactiveDetectionConfigurationRuleDefinitionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.helpUrl = defaults.helpUrl;
    	      this.isEnabledByDefault = defaults.isEnabledByDefault;
    	      this.isHidden = defaults.isHidden;
    	      this.isInPreview = defaults.isInPreview;
    	      this.name = defaults.name;
    	      this.supportsEmailNotifications = defaults.supportsEmailNotifications;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Codegen.ofNullable(displayName);
            return this;
        }
        public Builder helpUrl(@Nullable Output<String> helpUrl) {
            this.helpUrl = helpUrl;
            return this;
        }
        public Builder helpUrl(@Nullable String helpUrl) {
            this.helpUrl = Codegen.ofNullable(helpUrl);
            return this;
        }
        public Builder isEnabledByDefault(@Nullable Output<Boolean> isEnabledByDefault) {
            this.isEnabledByDefault = isEnabledByDefault;
            return this;
        }
        public Builder isEnabledByDefault(@Nullable Boolean isEnabledByDefault) {
            this.isEnabledByDefault = Codegen.ofNullable(isEnabledByDefault);
            return this;
        }
        public Builder isHidden(@Nullable Output<Boolean> isHidden) {
            this.isHidden = isHidden;
            return this;
        }
        public Builder isHidden(@Nullable Boolean isHidden) {
            this.isHidden = Codegen.ofNullable(isHidden);
            return this;
        }
        public Builder isInPreview(@Nullable Output<Boolean> isInPreview) {
            this.isInPreview = isInPreview;
            return this;
        }
        public Builder isInPreview(@Nullable Boolean isInPreview) {
            this.isInPreview = Codegen.ofNullable(isInPreview);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder supportsEmailNotifications(@Nullable Output<Boolean> supportsEmailNotifications) {
            this.supportsEmailNotifications = supportsEmailNotifications;
            return this;
        }
        public Builder supportsEmailNotifications(@Nullable Boolean supportsEmailNotifications) {
            this.supportsEmailNotifications = Codegen.ofNullable(supportsEmailNotifications);
            return this;
        }        public ApplicationInsightsComponentProactiveDetectionConfigurationRuleDefinitionsArgs build() {
            return new ApplicationInsightsComponentProactiveDetectionConfigurationRuleDefinitionsArgs(description, displayName, helpUrl, isEnabledByDefault, isHidden, isInPreview, name, supportsEmailNotifications);
        }
    }
}
