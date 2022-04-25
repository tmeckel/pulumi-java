// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dns.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RecordSetState extends com.pulumi.resources.ResourceArgs {

    public static final RecordSetState Empty = new RecordSetState();

    /**
     * The name of the zone in which this record set will
     * reside.
     * 
     */
    @Import(name="managedZone")
    private @Nullable Output<String> managedZone;

    /**
     * @return The name of the zone in which this record set will
     * reside.
     * 
     */
    public Optional<Output<String>> managedZone() {
        return Optional.ofNullable(this.managedZone);
    }

    /**
     * The DNS name this record set will apply to.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The DNS name this record set will apply to.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The string data for the records in this record set whose meaning depends on the DNS type. For TXT record, if the string
     * data contains spaces, add surrounding \&#34; if you don&#39;t want your string to get split on spaces. To specify a single
     * record value longer than 255 characters such as a TXT record for DKIM, add \&#34;\&#34; inside the Terraform configuration
     * string (e.g. &#34;first255characters\&#34;\&#34;morecharacters&#34;).
     * 
     */
    @Import(name="rrdatas")
    private @Nullable Output<List<String>> rrdatas;

    /**
     * @return The string data for the records in this record set whose meaning depends on the DNS type. For TXT record, if the string
     * data contains spaces, add surrounding \&#34; if you don&#39;t want your string to get split on spaces. To specify a single
     * record value longer than 255 characters such as a TXT record for DKIM, add \&#34;\&#34; inside the Terraform configuration
     * string (e.g. &#34;first255characters\&#34;\&#34;morecharacters&#34;).
     * 
     */
    public Optional<Output<List<String>>> rrdatas() {
        return Optional.ofNullable(this.rrdatas);
    }

    /**
     * The time-to-live of this record set (seconds).
     * 
     */
    @Import(name="ttl")
    private @Nullable Output<Integer> ttl;

    /**
     * @return The time-to-live of this record set (seconds).
     * 
     */
    public Optional<Output<Integer>> ttl() {
        return Optional.ofNullable(this.ttl);
    }

    /**
     * The DNS record set type.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The DNS record set type.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private RecordSetState() {}

    private RecordSetState(RecordSetState $) {
        this.managedZone = $.managedZone;
        this.name = $.name;
        this.project = $.project;
        this.rrdatas = $.rrdatas;
        this.ttl = $.ttl;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RecordSetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RecordSetState $;

        public Builder() {
            $ = new RecordSetState();
        }

        public Builder(RecordSetState defaults) {
            $ = new RecordSetState(Objects.requireNonNull(defaults));
        }

        /**
         * @param managedZone The name of the zone in which this record set will
         * reside.
         * 
         * @return builder
         * 
         */
        public Builder managedZone(@Nullable Output<String> managedZone) {
            $.managedZone = managedZone;
            return this;
        }

        /**
         * @param managedZone The name of the zone in which this record set will
         * reside.
         * 
         * @return builder
         * 
         */
        public Builder managedZone(String managedZone) {
            return managedZone(Output.of(managedZone));
        }

        /**
         * @param name The DNS name this record set will apply to.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The DNS name this record set will apply to.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param project The ID of the project in which the resource belongs. If it
         * is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs. If it
         * is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param rrdatas The string data for the records in this record set whose meaning depends on the DNS type. For TXT record, if the string
         * data contains spaces, add surrounding \&#34; if you don&#39;t want your string to get split on spaces. To specify a single
         * record value longer than 255 characters such as a TXT record for DKIM, add \&#34;\&#34; inside the Terraform configuration
         * string (e.g. &#34;first255characters\&#34;\&#34;morecharacters&#34;).
         * 
         * @return builder
         * 
         */
        public Builder rrdatas(@Nullable Output<List<String>> rrdatas) {
            $.rrdatas = rrdatas;
            return this;
        }

        /**
         * @param rrdatas The string data for the records in this record set whose meaning depends on the DNS type. For TXT record, if the string
         * data contains spaces, add surrounding \&#34; if you don&#39;t want your string to get split on spaces. To specify a single
         * record value longer than 255 characters such as a TXT record for DKIM, add \&#34;\&#34; inside the Terraform configuration
         * string (e.g. &#34;first255characters\&#34;\&#34;morecharacters&#34;).
         * 
         * @return builder
         * 
         */
        public Builder rrdatas(List<String> rrdatas) {
            return rrdatas(Output.of(rrdatas));
        }

        /**
         * @param rrdatas The string data for the records in this record set whose meaning depends on the DNS type. For TXT record, if the string
         * data contains spaces, add surrounding \&#34; if you don&#39;t want your string to get split on spaces. To specify a single
         * record value longer than 255 characters such as a TXT record for DKIM, add \&#34;\&#34; inside the Terraform configuration
         * string (e.g. &#34;first255characters\&#34;\&#34;morecharacters&#34;).
         * 
         * @return builder
         * 
         */
        public Builder rrdatas(String... rrdatas) {
            return rrdatas(List.of(rrdatas));
        }

        /**
         * @param ttl The time-to-live of this record set (seconds).
         * 
         * @return builder
         * 
         */
        public Builder ttl(@Nullable Output<Integer> ttl) {
            $.ttl = ttl;
            return this;
        }

        /**
         * @param ttl The time-to-live of this record set (seconds).
         * 
         * @return builder
         * 
         */
        public Builder ttl(Integer ttl) {
            return ttl(Output.of(ttl));
        }

        /**
         * @param type The DNS record set type.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The DNS record set type.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public RecordSetState build() {
            return $;
        }
    }

}
