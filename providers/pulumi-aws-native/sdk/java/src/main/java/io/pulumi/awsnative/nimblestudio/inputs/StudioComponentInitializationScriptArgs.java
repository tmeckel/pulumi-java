// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.nimblestudio.inputs;

import io.pulumi.awsnative.nimblestudio.enums.StudioComponentInitializationScriptRunContext;
import io.pulumi.awsnative.nimblestudio.enums.StudioComponentLaunchProfilePlatform;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * <p>Initialization scripts for studio components.</p>
 * 
 */
public final class StudioComponentInitializationScriptArgs extends io.pulumi.resources.ResourceArgs {

    public static final StudioComponentInitializationScriptArgs Empty = new StudioComponentInitializationScriptArgs();

    /**
     * <p>The version number of the protocol that is used by the launch profile. The only valid version is "2021-03-31".</p>
     * 
     */
    @InputImport(name="launchProfileProtocolVersion")
      private final @Nullable Input<String> launchProfileProtocolVersion;

    public Input<String> getLaunchProfileProtocolVersion() {
        return this.launchProfileProtocolVersion == null ? Input.empty() : this.launchProfileProtocolVersion;
    }

    @InputImport(name="platform")
      private final @Nullable Input<StudioComponentLaunchProfilePlatform> platform;

    public Input<StudioComponentLaunchProfilePlatform> getPlatform() {
        return this.platform == null ? Input.empty() : this.platform;
    }

    @InputImport(name="runContext")
      private final @Nullable Input<StudioComponentInitializationScriptRunContext> runContext;

    public Input<StudioComponentInitializationScriptRunContext> getRunContext() {
        return this.runContext == null ? Input.empty() : this.runContext;
    }

    /**
     * <p>The initialization script.</p>
     * 
     */
    @InputImport(name="script")
      private final @Nullable Input<String> script;

    public Input<String> getScript() {
        return this.script == null ? Input.empty() : this.script;
    }

    public StudioComponentInitializationScriptArgs(
        @Nullable Input<String> launchProfileProtocolVersion,
        @Nullable Input<StudioComponentLaunchProfilePlatform> platform,
        @Nullable Input<StudioComponentInitializationScriptRunContext> runContext,
        @Nullable Input<String> script) {
        this.launchProfileProtocolVersion = launchProfileProtocolVersion;
        this.platform = platform;
        this.runContext = runContext;
        this.script = script;
    }

    private StudioComponentInitializationScriptArgs() {
        this.launchProfileProtocolVersion = Input.empty();
        this.platform = Input.empty();
        this.runContext = Input.empty();
        this.script = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StudioComponentInitializationScriptArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> launchProfileProtocolVersion;
        private @Nullable Input<StudioComponentLaunchProfilePlatform> platform;
        private @Nullable Input<StudioComponentInitializationScriptRunContext> runContext;
        private @Nullable Input<String> script;

        public Builder() {
    	      // Empty
        }

        public Builder(StudioComponentInitializationScriptArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.launchProfileProtocolVersion = defaults.launchProfileProtocolVersion;
    	      this.platform = defaults.platform;
    	      this.runContext = defaults.runContext;
    	      this.script = defaults.script;
        }

        public Builder launchProfileProtocolVersion(@Nullable Input<String> launchProfileProtocolVersion) {
            this.launchProfileProtocolVersion = launchProfileProtocolVersion;
            return this;
        }

        public Builder launchProfileProtocolVersion(@Nullable String launchProfileProtocolVersion) {
            this.launchProfileProtocolVersion = Input.ofNullable(launchProfileProtocolVersion);
            return this;
        }

        public Builder platform(@Nullable Input<StudioComponentLaunchProfilePlatform> platform) {
            this.platform = platform;
            return this;
        }

        public Builder platform(@Nullable StudioComponentLaunchProfilePlatform platform) {
            this.platform = Input.ofNullable(platform);
            return this;
        }

        public Builder runContext(@Nullable Input<StudioComponentInitializationScriptRunContext> runContext) {
            this.runContext = runContext;
            return this;
        }

        public Builder runContext(@Nullable StudioComponentInitializationScriptRunContext runContext) {
            this.runContext = Input.ofNullable(runContext);
            return this;
        }

        public Builder script(@Nullable Input<String> script) {
            this.script = script;
            return this;
        }

        public Builder script(@Nullable String script) {
            this.script = Input.ofNullable(script);
            return this;
        }
        public StudioComponentInitializationScriptArgs build() {
            return new StudioComponentInitializationScriptArgs(launchProfileProtocolVersion, platform, runContext, script);
        }
    }
}
