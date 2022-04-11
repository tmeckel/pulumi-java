// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appstream.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class StackUserSettingGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final StackUserSettingGetArgs Empty = new StackUserSettingGetArgs();

    /**
     * Action that is enabled or disabled. Valid values are: `CLIPBOARD_COPY_FROM_LOCAL_DEVICE`,  `CLIPBOARD_COPY_TO_LOCAL_DEVICE`, `FILE_UPLOAD`, `FILE_DOWNLOAD`, `PRINTING_TO_LOCAL_DEVICE`, `DOMAIN_PASSWORD_SIGNIN`, `DOMAIN_SMART_CARD_SIGNIN`.
     * 
     */
    @Import(name="action", required=true)
      private final Output<String> action;

    public Output<String> getAction() {
        return this.action;
    }

    /**
     * Indicates whether the action is enabled or disabled. Valid values are: `ENABLED`, `DISABLED`.
     * 
     */
    @Import(name="permission", required=true)
      private final Output<String> permission;

    public Output<String> getPermission() {
        return this.permission;
    }

    public StackUserSettingGetArgs(
        Output<String> action,
        Output<String> permission) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
        this.permission = Objects.requireNonNull(permission, "expected parameter 'permission' to be non-null");
    }

    private StackUserSettingGetArgs() {
        this.action = Codegen.empty();
        this.permission = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StackUserSettingGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> action;
        private Output<String> permission;

        public Builder() {
    	      // Empty
        }

        public Builder(StackUserSettingGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.permission = defaults.permission;
        }

        public Builder action(Output<String> action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        public Builder action(String action) {
            this.action = Output.of(Objects.requireNonNull(action));
            return this;
        }
        public Builder permission(Output<String> permission) {
            this.permission = Objects.requireNonNull(permission);
            return this;
        }
        public Builder permission(String permission) {
            this.permission = Output.of(Objects.requireNonNull(permission));
            return this;
        }        public StackUserSettingGetArgs build() {
            return new StackUserSettingGetArgs(action, permission);
        }
    }
}
