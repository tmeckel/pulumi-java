// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.secretsmanager.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSecretArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSecretArgs Empty = new GetSecretArgs();

    /**
     * The Amazon Resource Name (ARN) of the secret to retrieve.
     * 
     */
    @Import(name="arn")
    private @Nullable String arn;

    /**
     * @return The Amazon Resource Name (ARN) of the secret to retrieve.
     * 
     */
    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The name of the secret to retrieve.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return The name of the secret to retrieve.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    private GetSecretArgs() {}

    private GetSecretArgs(GetSecretArgs $) {
        this.arn = $.arn;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSecretArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSecretArgs $;

        public Builder() {
            $ = new GetSecretArgs();
        }

        public Builder(GetSecretArgs defaults) {
            $ = new GetSecretArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The Amazon Resource Name (ARN) of the secret to retrieve.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable String arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param name The name of the secret to retrieve.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public GetSecretArgs build() {
            return $;
        }
    }

}
