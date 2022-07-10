package icu.bitchigo.blog.controller;

import icu.bitchigo.blog.base.Response;
import icu.bitchigo.blog.service.intf.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static icu.bitchigo.blog.base.EnumResponseCode.OK;

@RestController
@RequestMapping("/blog/post")
public class PostController {
    @Autowired
    private PostService postService;
    @GetMapping("/id/list")
    public Response<List<Long>> getPostById() {
        return Response.build(postService.sleectIdList(), OK);
    }
}
