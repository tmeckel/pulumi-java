// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.azurenative.containerregistry.enums.SourceRegistryLoginMode;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes the credential parameters for accessing the source registry.
 * 
 */
public final class SourceRegistryCredentialsArgs extends io.pulumi.resources.ResourceArgs {

    public static final SourceRegistryCredentialsArgs Empty = new SourceRegistryCredentialsArgs();

    /**
     * The authentication mode which determines the source registry login scope. The credentials for the source registry
     * will be generated using the given scope. These credentials will be used to login to
     * the source registry during the run.
     * 
     */
    @Import(name="loginMode")
      private final @Nullable Output<Either<String,SourceRegistryLoginMode>> loginMode;

    public Output<Either<String,SourceRegistryLoginMode>> getLoginMode() {
        return this.loginMode == null ? Codegen.empty() : this.loginMode;
    }

    public SourceRegistryCredentialsArgs(@Nullable Output<Either<String,SourceRegistryLoginMode>> loginMode) {
        this.loginMode = loginMode;
    }

    private SourceRegistryCredentialsArgs() {
        this.loginMode = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceRegistryCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,SourceRegistryLoginMode>> loginMode;

        public Builder() {
    	      // Empty
        }

        public Builder(SourceRegistryCredentialsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.loginMode = defaults.loginMode;
        }

        public Builder loginMode(@Nullable Output<Either<String,SourceRegistryLoginMode>> loginMode) {
            this.loginMode = loginMode;
            return this;
        }
        public Builder loginMode(@Nullable Either<String,SourceRegistryLoginMode> loginMode) {
            this.loginMode = Codegen.ofNullable(loginMode);
            return this;
        }        public SourceRegistryCredentialsArgs build() {
            return new SourceRegistryCredentialsArgs(loginMode);
        }
    }
}
