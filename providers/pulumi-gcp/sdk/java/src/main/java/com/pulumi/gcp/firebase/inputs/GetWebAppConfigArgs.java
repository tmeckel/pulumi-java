// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.firebase.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetWebAppConfigArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWebAppConfigArgs Empty = new GetWebAppConfigArgs();

    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable String project;

    /**
     * @return The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * the id of the firebase web app
     * 
     */
    @Import(name="webAppId", required=true)
    private String webAppId;

    /**
     * @return the id of the firebase web app
     * 
     */
    public String webAppId() {
        return this.webAppId;
    }

    private GetWebAppConfigArgs() {}

    private GetWebAppConfigArgs(GetWebAppConfigArgs $) {
        this.project = $.project;
        this.webAppId = $.webAppId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWebAppConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWebAppConfigArgs $;

        public Builder() {
            $ = new GetWebAppConfigArgs();
        }

        public Builder(GetWebAppConfigArgs defaults) {
            $ = new GetWebAppConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param project The ID of the project in which the resource belongs. If it
         * is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        /**
         * @param webAppId the id of the firebase web app
         * 
         * @return builder
         * 
         */
        public Builder webAppId(String webAppId) {
            $.webAppId = webAppId;
            return this;
        }

        public GetWebAppConfigArgs build() {
            $.webAppId = Objects.requireNonNull($.webAppId, "expected parameter 'webAppId' to be non-null");
            return $;
        }
    }

}
