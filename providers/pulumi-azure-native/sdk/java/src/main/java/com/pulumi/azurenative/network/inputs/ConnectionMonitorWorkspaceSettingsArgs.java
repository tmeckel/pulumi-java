// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the settings for producing output into a log analytics workspace.
 * 
 */
public final class ConnectionMonitorWorkspaceSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionMonitorWorkspaceSettingsArgs Empty = new ConnectionMonitorWorkspaceSettingsArgs();

    /**
     * Log analytics workspace resource ID.
     * 
     */
    @Import(name="workspaceResourceId")
    private @Nullable Output<String> workspaceResourceId;

    /**
     * @return Log analytics workspace resource ID.
     * 
     */
    public Optional<Output<String>> workspaceResourceId() {
        return Optional.ofNullable(this.workspaceResourceId);
    }

    private ConnectionMonitorWorkspaceSettingsArgs() {}

    private ConnectionMonitorWorkspaceSettingsArgs(ConnectionMonitorWorkspaceSettingsArgs $) {
        this.workspaceResourceId = $.workspaceResourceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionMonitorWorkspaceSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionMonitorWorkspaceSettingsArgs $;

        public Builder() {
            $ = new ConnectionMonitorWorkspaceSettingsArgs();
        }

        public Builder(ConnectionMonitorWorkspaceSettingsArgs defaults) {
            $ = new ConnectionMonitorWorkspaceSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param workspaceResourceId Log analytics workspace resource ID.
         * 
         * @return builder
         * 
         */
        public Builder workspaceResourceId(@Nullable Output<String> workspaceResourceId) {
            $.workspaceResourceId = workspaceResourceId;
            return this;
        }

        /**
         * @param workspaceResourceId Log analytics workspace resource ID.
         * 
         * @return builder
         * 
         */
        public Builder workspaceResourceId(String workspaceResourceId) {
            return workspaceResourceId(Output.of(workspaceResourceId));
        }

        public ConnectionMonitorWorkspaceSettingsArgs build() {
            return $;
        }
    }

}
