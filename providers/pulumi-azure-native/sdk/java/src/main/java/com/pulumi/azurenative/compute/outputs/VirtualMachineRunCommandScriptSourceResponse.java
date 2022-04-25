// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualMachineRunCommandScriptSourceResponse {
    /**
     * @return Specifies a commandId of predefined built-in script.
     * 
     */
    private final @Nullable String commandId;
    /**
     * @return Specifies the script content to be executed on the VM.
     * 
     */
    private final @Nullable String script;
    /**
     * @return Specifies the script download location.
     * 
     */
    private final @Nullable String scriptUri;

    @CustomType.Constructor
    private VirtualMachineRunCommandScriptSourceResponse(
        @CustomType.Parameter("commandId") @Nullable String commandId,
        @CustomType.Parameter("script") @Nullable String script,
        @CustomType.Parameter("scriptUri") @Nullable String scriptUri) {
        this.commandId = commandId;
        this.script = script;
        this.scriptUri = scriptUri;
    }

    /**
     * @return Specifies a commandId of predefined built-in script.
     * 
     */
    public Optional<String> commandId() {
        return Optional.ofNullable(this.commandId);
    }
    /**
     * @return Specifies the script content to be executed on the VM.
     * 
     */
    public Optional<String> script() {
        return Optional.ofNullable(this.script);
    }
    /**
     * @return Specifies the script download location.
     * 
     */
    public Optional<String> scriptUri() {
        return Optional.ofNullable(this.scriptUri);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineRunCommandScriptSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String commandId;
        private @Nullable String script;
        private @Nullable String scriptUri;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineRunCommandScriptSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commandId = defaults.commandId;
    	      this.script = defaults.script;
    	      this.scriptUri = defaults.scriptUri;
        }

        public Builder commandId(@Nullable String commandId) {
            this.commandId = commandId;
            return this;
        }
        public Builder script(@Nullable String script) {
            this.script = script;
            return this;
        }
        public Builder scriptUri(@Nullable String scriptUri) {
            this.scriptUri = scriptUri;
            return this;
        }        public VirtualMachineRunCommandScriptSourceResponse build() {
            return new VirtualMachineRunCommandScriptSourceResponse(commandId, script, scriptUri);
        }
    }
}
