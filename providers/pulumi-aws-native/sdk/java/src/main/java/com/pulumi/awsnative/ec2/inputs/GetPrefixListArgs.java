// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPrefixListArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPrefixListArgs Empty = new GetPrefixListArgs();

    /**
     * Id of Prefix List.
     * 
     */
    @Import(name="prefixListId", required=true)
    private String prefixListId;

    /**
     * @return Id of Prefix List.
     * 
     */
    public String prefixListId() {
        return this.prefixListId;
    }

    private GetPrefixListArgs() {}

    private GetPrefixListArgs(GetPrefixListArgs $) {
        this.prefixListId = $.prefixListId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPrefixListArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPrefixListArgs $;

        public Builder() {
            $ = new GetPrefixListArgs();
        }

        public Builder(GetPrefixListArgs defaults) {
            $ = new GetPrefixListArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param prefixListId Id of Prefix List.
         * 
         * @return builder
         * 
         */
        public Builder prefixListId(String prefixListId) {
            $.prefixListId = prefixListId;
            return this;
        }

        public GetPrefixListArgs build() {
            $.prefixListId = Objects.requireNonNull($.prefixListId, "expected parameter 'prefixListId' to be non-null");
            return $;
        }
    }

}
