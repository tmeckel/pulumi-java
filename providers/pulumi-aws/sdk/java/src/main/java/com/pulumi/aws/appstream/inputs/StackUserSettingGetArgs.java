// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appstream.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class StackUserSettingGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final StackUserSettingGetArgs Empty = new StackUserSettingGetArgs();

    /**
     * Action that is enabled or disabled. Valid values are: `CLIPBOARD_COPY_FROM_LOCAL_DEVICE`,  `CLIPBOARD_COPY_TO_LOCAL_DEVICE`, `FILE_UPLOAD`, `FILE_DOWNLOAD`, `PRINTING_TO_LOCAL_DEVICE`, `DOMAIN_PASSWORD_SIGNIN`, `DOMAIN_SMART_CARD_SIGNIN`.
     * 
     */
    @Import(name="action", required=true)
    private Output<String> action;

    /**
     * @return Action that is enabled or disabled. Valid values are: `CLIPBOARD_COPY_FROM_LOCAL_DEVICE`,  `CLIPBOARD_COPY_TO_LOCAL_DEVICE`, `FILE_UPLOAD`, `FILE_DOWNLOAD`, `PRINTING_TO_LOCAL_DEVICE`, `DOMAIN_PASSWORD_SIGNIN`, `DOMAIN_SMART_CARD_SIGNIN`.
     * 
     */
    public Output<String> action() {
        return this.action;
    }

    /**
     * Indicates whether the action is enabled or disabled. Valid values are: `ENABLED`, `DISABLED`.
     * 
     */
    @Import(name="permission", required=true)
    private Output<String> permission;

    /**
     * @return Indicates whether the action is enabled or disabled. Valid values are: `ENABLED`, `DISABLED`.
     * 
     */
    public Output<String> permission() {
        return this.permission;
    }

    private StackUserSettingGetArgs() {}

    private StackUserSettingGetArgs(StackUserSettingGetArgs $) {
        this.action = $.action;
        this.permission = $.permission;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StackUserSettingGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StackUserSettingGetArgs $;

        public Builder() {
            $ = new StackUserSettingGetArgs();
        }

        public Builder(StackUserSettingGetArgs defaults) {
            $ = new StackUserSettingGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action Action that is enabled or disabled. Valid values are: `CLIPBOARD_COPY_FROM_LOCAL_DEVICE`,  `CLIPBOARD_COPY_TO_LOCAL_DEVICE`, `FILE_UPLOAD`, `FILE_DOWNLOAD`, `PRINTING_TO_LOCAL_DEVICE`, `DOMAIN_PASSWORD_SIGNIN`, `DOMAIN_SMART_CARD_SIGNIN`.
         * 
         * @return builder
         * 
         */
        public Builder action(Output<String> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action Action that is enabled or disabled. Valid values are: `CLIPBOARD_COPY_FROM_LOCAL_DEVICE`,  `CLIPBOARD_COPY_TO_LOCAL_DEVICE`, `FILE_UPLOAD`, `FILE_DOWNLOAD`, `PRINTING_TO_LOCAL_DEVICE`, `DOMAIN_PASSWORD_SIGNIN`, `DOMAIN_SMART_CARD_SIGNIN`.
         * 
         * @return builder
         * 
         */
        public Builder action(String action) {
            return action(Output.of(action));
        }

        /**
         * @param permission Indicates whether the action is enabled or disabled. Valid values are: `ENABLED`, `DISABLED`.
         * 
         * @return builder
         * 
         */
        public Builder permission(Output<String> permission) {
            $.permission = permission;
            return this;
        }

        /**
         * @param permission Indicates whether the action is enabled or disabled. Valid values are: `ENABLED`, `DISABLED`.
         * 
         * @return builder
         * 
         */
        public Builder permission(String permission) {
            return permission(Output.of(permission));
        }

        public StackUserSettingGetArgs build() {
            $.action = Objects.requireNonNull($.action, "expected parameter 'action' to be non-null");
            $.permission = Objects.requireNonNull($.permission, "expected parameter 'permission' to be non-null");
            return $;
        }
    }

}
