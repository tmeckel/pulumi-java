// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.enums.ComponentNames;
import io.pulumi.azurenative.compute.enums.PassNames;
import io.pulumi.azurenative.compute.enums.SettingNames;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies additional XML formatted information that can be included in the Unattend.xml file, which is used by Windows Setup. Contents are defined by setting name, component name, and the pass in which the content is applied.
 * 
 */
public final class AdditionalUnattendContentArgs extends io.pulumi.resources.ResourceArgs {

    public static final AdditionalUnattendContentArgs Empty = new AdditionalUnattendContentArgs();

    /**
     * The component name. Currently, the only allowable value is Microsoft-Windows-Shell-Setup.
     * 
     */
    @Import(name="componentName")
      private final @Nullable Output<ComponentNames> componentName;

    public Output<ComponentNames> getComponentName() {
        return this.componentName == null ? Codegen.empty() : this.componentName;
    }

    /**
     * Specifies the XML formatted content that is added to the unattend.xml file for the specified path and component. The XML must be less than 4KB and must include the root element for the setting or feature that is being inserted.
     * 
     */
    @Import(name="content")
      private final @Nullable Output<String> content;

    public Output<String> getContent() {
        return this.content == null ? Codegen.empty() : this.content;
    }

    /**
     * The pass name. Currently, the only allowable value is OobeSystem.
     * 
     */
    @Import(name="passName")
      private final @Nullable Output<PassNames> passName;

    public Output<PassNames> getPassName() {
        return this.passName == null ? Codegen.empty() : this.passName;
    }

    /**
     * Specifies the name of the setting to which the content applies. Possible values are: FirstLogonCommands and AutoLogon.
     * 
     */
    @Import(name="settingName")
      private final @Nullable Output<SettingNames> settingName;

    public Output<SettingNames> getSettingName() {
        return this.settingName == null ? Codegen.empty() : this.settingName;
    }

    public AdditionalUnattendContentArgs(
        @Nullable Output<ComponentNames> componentName,
        @Nullable Output<String> content,
        @Nullable Output<PassNames> passName,
        @Nullable Output<SettingNames> settingName) {
        this.componentName = componentName;
        this.content = content;
        this.passName = passName;
        this.settingName = settingName;
    }

    private AdditionalUnattendContentArgs() {
        this.componentName = Codegen.empty();
        this.content = Codegen.empty();
        this.passName = Codegen.empty();
        this.settingName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AdditionalUnattendContentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ComponentNames> componentName;
        private @Nullable Output<String> content;
        private @Nullable Output<PassNames> passName;
        private @Nullable Output<SettingNames> settingName;

        public Builder() {
    	      // Empty
        }

        public Builder(AdditionalUnattendContentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.componentName = defaults.componentName;
    	      this.content = defaults.content;
    	      this.passName = defaults.passName;
    	      this.settingName = defaults.settingName;
        }

        public Builder componentName(@Nullable Output<ComponentNames> componentName) {
            this.componentName = componentName;
            return this;
        }
        public Builder componentName(@Nullable ComponentNames componentName) {
            this.componentName = Codegen.ofNullable(componentName);
            return this;
        }
        public Builder content(@Nullable Output<String> content) {
            this.content = content;
            return this;
        }
        public Builder content(@Nullable String content) {
            this.content = Codegen.ofNullable(content);
            return this;
        }
        public Builder passName(@Nullable Output<PassNames> passName) {
            this.passName = passName;
            return this;
        }
        public Builder passName(@Nullable PassNames passName) {
            this.passName = Codegen.ofNullable(passName);
            return this;
        }
        public Builder settingName(@Nullable Output<SettingNames> settingName) {
            this.settingName = settingName;
            return this;
        }
        public Builder settingName(@Nullable SettingNames settingName) {
            this.settingName = Codegen.ofNullable(settingName);
            return this;
        }        public AdditionalUnattendContentArgs build() {
            return new AdditionalUnattendContentArgs(componentName, content, passName, settingName);
        }
    }
}
